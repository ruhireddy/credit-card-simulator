const pathArray = (window.location.pathname).split("/");

const tableHolderData = [];





function goToUserHome() {
    window.location.href = "http://localhost:8080/api/account-holders/" + pathArray[3] + "/homepage";
}

function goToUserTransactions() {
    window.location.href = "http://localhost:8080/api/account-holders/" + pathArray[3] + "/transactions";
}

function goToUserStatements() {
    window.location.href = "http://localhost:8080/api/account-holders/" + pathArray[3] + "/statements";

}