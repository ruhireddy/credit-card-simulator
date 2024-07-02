// TODO: make sure navbar buttons go to correct endpoint (dynamic based on user!)

// we are assuming our url looks like this:
// http://localhost:8080/api/account-holders/{phone-number}/transactions
const pathArray1 = window.location.pathname.split("/");

const cardsToSearchThrough1 = [];
let sum = 0;
// * main program entry point
popHomepage();

function popHomepage() {
	const accountHolderOwnedCards = "http://localhost:8080/api/account-holders/" + pathArray1[3];
	const cardsContainer = document.getElementById("home");
	fetch(accountHolderOwnedCards)
		.then((response) => response.json())
		.then((data) => {
			for (card in data.ownedCreditCards) {
				cardsToSearchThrough1.push(data.ownedCreditCards[card]);
				const nextCardInfo = "http://localhost:8080/api/card/" + cardsToSearchThrough1[card];
				fetch(nextCardInfo)
					.then((response) => response.json())
					.then((data) => {
						const cardDiv = document.createElement("div");
						cardDiv.classList.add("card");

						const cardNumber = document.createElement("h2");
						cardNumber.textContent = `${data.cardName}`;

						const creditLimit = document.createElement("p");
						creditLimit.textContent = `Credit Limit: $${data.creditLimit}`;

						const cardBalance = document.createElement("p");

						let sum = 0;
						for (transaction in data.transactions) {
							sum += parseFloat(data.transactions[transaction].amount);
						}

						cardBalance.textContent = `Card Balance: $${sum.toFixed(2)}`;

						// Create a new button element
						var button = document.createElement("button");

						// Set the button text
						button.innerText = "Transactions";
						const transactionsHTML = `
						  <div id="transactions" class="page">
							<h2>Transaction History</h2>
							<div class="transactions">
							  <h3>Details</h3>
							  <table id="transactions-table">
								<thead>
								  <tr class="transaction-list-element">
									<th>Reference</th>
									<th>Date</th>
									<th>Amount</th>
									<th>City</th>
									<th>State</th>
									<th>Country</th>
									<th>Merchant</th>
									<th>Category</th>
									<th>Status</th>
								  </tr>
								</thead>
								<tbody>
								  <!-- Table rows will be added here dynamically -->
								</tbody>
							  </table>
							</div>
						  </div>
						`;
						const transactions = document.createElement("div");
						transactions.innerHTML = transactionsHTML;
						transactions.style.display = "none";

						const tbody = transactions.querySelector("tbody");
						data.transactions.forEach((transaction) => {
							const row = document.createElement("tr");
							row.innerHTML = `
						  <td>${transaction.transactionId}</td>
						  <td>${new Date(transaction.date).toLocaleDateString()}</td>
						  <td>$${transaction.amount}</td>
						  <td>${transaction.city}</td>
						  <td>${transaction.state}</td>
						  <td>${transaction.country}</td>
						  <td>${transaction.merchant}</td>
						  <td>${transaction.merchantCategory}</td>
						  <td>Pending</td>
						`;
							tbody.appendChild(row);
						});

						// Add an event listener to the button
						button.addEventListener("click", function () {
							if (transactions.style.display == "block") transactions.style.display = "none";
							else transactions.style.display = "block";
						});

						cardDiv.appendChild(cardNumber);
						cardDiv.appendChild(creditLimit);
						cardDiv.appendChild(cardBalance);
						cardDiv.appendChild(button);
						cardDiv.appendChild(transactions);
						cardsContainer.appendChild(cardDiv);
					});
			}
		});
}
