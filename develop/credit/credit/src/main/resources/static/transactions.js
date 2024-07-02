// we are assuming our url looks like this:
// http://localhost:8080/api/account-holders/{phone-number}/transactions

const tableHolderData = [];
const arrayDates = [];
const pathArray = window.location.pathname.split("/");

const cardsToSearchThrough = [];

// * main program entry point
fetchAccountHolderOwnedCards();

function fetchAccountHolderOwnedCards() {
	const accountHolderOwnedCards = "http://localhost:8080/api/account-holders/" + pathArray[3];

	fetch(accountHolderOwnedCards)
		.then((response) => response.json())
		.then((data) => {
			for (card in data.ownedCreditCards) {
				cardsToSearchThrough.push(data.ownedCreditCards[card]);
			}
			parseAndDisplayTransactions();
		});
}

function parseAndDisplayTransactions() {
	for (card in cardsToSearchThrough) {
		// fetch next card's transactions
		fetch("http://localhost:8080/api/card/" + cardsToSearchThrough[card])
			.then((response) => response.json())
			.then((data) => {
				for (transaction in data.transactions) {
					// these two lines are mad sus; replace with real sorting
					dateAsDate = new Date(data.transactions[transaction].date);
					arrayDates.push(dateAsDate);
				}
				prepDataForTable(data);
				writeToTable();
			});
	}
}

function prepDataForTable(data) {
	for (i in data.transactions) {
		const tableRowNode = document.createElement("tr");

		var newCell = tableRowNode.insertCell(0);
		newCell.textContent = data.transactions[i].transactionId;

		newCell = tableRowNode.insertCell(1);
		newCell.textContent = arrayDates[i].toLocaleDateString();

		newCell = tableRowNode.insertCell(2);
		newCell.textContent = data.transactions[i].amount;

		newCell = tableRowNode.insertCell(3);
		newCell.textContent = data.transactions[i].city;

		newCell = tableRowNode.insertCell(4);
		newCell.textContent = data.transactions[i].state;

		newCell = tableRowNode.insertCell(5);
		newCell.textContent = data.transactions[i].country;

		newCell = tableRowNode.insertCell(6);
		newCell.textContent = data.transactions[i].merchant;

		newCell = tableRowNode.insertCell(7);
		newCell.textContent = data.transactions[i].merchantCategory;

		newCell = tableRowNode.insertCell(8);
		newCell.textContent = "Pending";

		tableHolderData.push(tableRowNode);
	}
}

function writeToTable() {
	sortTransactionsByDate();
	var tableReference = document.getElementById("transactions-table");
	for (i in tableHolderData) {
		tableReference.appendChild(tableHolderData[i]);
	}
}

function sortTransactionsByDate() {
	return arrayDates.sort((a, b) => b - a);
}

function goToUserHome() {
	window.location.href = "http://localhost:8080/api/account-holders/" + pathArray[3] + "/homepage";
}

function goToUserTransactions() {
	window.location.href = "http://localhost:8080/api/account-holders/" + pathArray[3] + "/transactions";
}

function goToUserStatements() {
	window.location.href = "http://localhost:8080/api/account-holders/" + pathArray[3] + "/statements";
}
