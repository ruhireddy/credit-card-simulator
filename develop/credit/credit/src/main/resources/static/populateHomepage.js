// TODO: make sure navbar buttons go to correct endpoint (dynamic based on user!)

// we are assuming our url looks like this:
// http://localhost:8080/api/account-holders/{phone-number}/transactions

const tableHolderData = [];
const arrayDates = [];
const pathArray = (window.location.pathname).split("/");

const cardsToSearchThrough = [];
let sum = 0;
// * main program entry point
fetchAccountHolderOwnedCards();

function fetchAccountHolderOwnedCards() {
    const accountHolderOwnedCards = "http://localhost:8080/api/account-holders/" + pathArray[3];
	const cardsContainer = document.getElementById('home');
    fetch(accountHolderOwnedCards)
    .then((response) => response.json())
    .then((data) => {
        for (card in data.ownedCreditCards) {
            cardsToSearchThrough.push(data.ownedCreditCards[card]);
			const nextCardInfo = "http://localhost:8080/api/card/" + cardsToSearchThrough[card];
			fetch(nextCardInfo)
				.then((response) => response.json())
				.then((data) => {
					const cardDiv = document.createElement('div');
					cardDiv.classList.add('card');

					const cardNumber = document.createElement('h2');
					cardNumber.textContent = `${data.cardName}`;

					const creditLimit = document.createElement('p');
					creditLimit.textContent = `Credit Limit: $${data.creditLimit}`;

					const cardBalance = document.createElement('p');

					let sum = 0;
					for (transaction in data.transactions) {
						console.log(sum);
						sum += parseFloat(data.transactions[transaction].amount);
					}

					cardBalance.textContent = `Card Balance: $${sum.toFixed(2)}`;

					// Create a new button element
					var button = document.createElement('button');

					// Set the button text
					button.innerText = "Transactions";

					// Add an event listener to the button
					button.addEventListener('click', function() {

					});

					cardDiv.appendChild(cardNumber);
					cardDiv.appendChild(creditLimit);
					cardDiv.appendChild(cardBalance);
					cardDiv.appendChild(button);
					cardsContainer.appendChild(cardDiv);

				});
        }
    });
}



/* presentation details

Your presentation should include:

- An introduction of the team and the project       (SEAN)
- An overview of your application architecture and design (JOHN)
- The technologies used in the project 
- A live demonstration of your application  (WHOEVER IS SCREENSHARING)
- A reflection of how you worked together as a team
- Lessons learned and what you would have done differently § What you would do next if you had more time


*/