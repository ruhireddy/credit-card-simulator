const TRANSACTIONS_HTML = `
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

const pathArray = window.location.pathname.split("/");
const userEmail = pathArray[3];
const cardsToSearchThrough = [];

homepageMain();

function homepageMain() {
	const accountHolderJSON = "http://localhost:8080/api/account-holders/" + userEmail;

	fetch(accountHolderJSON)
		.then((response) => response.json())
		.then((data) => {
			for (card in data.ownedCreditCards) {
				cardsToSearchThrough.push(data.ownedCreditCards[card]);
				const nextCardJSON = "http://localhost:8080/api/card/" + cardsToSearchThrough[card];
				fetch(nextCardJSON)
					.then((response) => response.json())
					.then((data) => {
						insertCCdisplaysOntoHomepage(data);

					});
			}
		});
}

function createMakePaymentButton() {
    var button = document.createElement("button");
	button.innerText = "Make Payment";

    return button;
}

function insertCCdisplaysOntoHomepage(data) {
	const cardDiv = createCardDivChildren(data);
	const cardsContainer = document.getElementById("home");
	cardsContainer.appendChild(cardDiv);
}

function createCardDivChildren(data) {
	const cardDiv = document.createElement("div");
	const cardName = document.createElement("h2");
	const creditLimit = document.createElement("p");
	const cardBalance = document.createElement("p");
    
	let transactionsSum = findTransactionsSum(data);

    var makePaymentButton = createMakePaymentButton();
    makePaymentButton.addEventListener("click", function () {
		let userInput = prompt("Enter payment amount");
        if (userInput != null) {
            let paymentAmount = parseFloat(userInput);
            if (paymentAmount > 0 && paymentAmount <= transactionsSum) {
                let newBalance = transactionsSum - paymentAmount;
                // let transactionsSum = transactionsSum - paymentAmount;
                cardBalance.textContent = `Card Balance: $${newBalance.toFixed(2)}`;
                transactionsSum = newBalance;
            }
        }
	});

	cardDiv.classList.add("card");
	cardName.textContent = `${data.cardName}`;
	creditLimit.textContent = `Credit Limit: $${data.creditLimit}`;
	cardBalance.textContent = `Card Balance: $${transactionsSum.toFixed(2)}`;

	var button = document.createElement("button");
	button.innerText = "Transactions";
	button.addEventListener("click", function () {
		if (transactions.style.display == "block") transactions.style.display = "none";
		else transactions.style.display = "block";
	});

	var transactions = createTransactionsTable(data);

	cardDiv.appendChild(cardName);
	cardDiv.appendChild(creditLimit);
	cardDiv.appendChild(cardBalance);
	cardDiv.appendChild(transactions);
	cardDiv.appendChild(button);
    cardDiv.appendChild(makePaymentButton);

	return cardDiv;
}

function createTransactionsTable(data) {
	const transactions = document.createElement("div");
	transactions.innerHTML = TRANSACTIONS_HTML;
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

	return transactions;
}

function findTransactionsSum(data) {
	let sum = 0;
	for (transaction in data.transactions) {
		sum += parseFloat(data.transactions[transaction].amount);
	}
	return sum;
}

function goToUserHome() {
	window.location.href = "http://localhost:8080/api/account-holders/" + userEmail + "/homepage";
}

function goToUserTransactions() {
	window.location.href = "http://localhost:8080/api/account-holders/" + userEmail + "/transactions";
}

function goToUserStatements() {
	window.location.href = "http://localhost:8080/api/account-holders/" + userEmail + "/statements";
}
