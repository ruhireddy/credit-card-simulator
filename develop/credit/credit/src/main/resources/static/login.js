window.addEventListener("load", () => {
	const form = document.querySelector("#login-form");
	const username = document.querySelector("#username");

	form.addEventListener("submit", (e) => {
		e.preventDefault();

		var new_url = "http://localhost:8080/api/account-holders/" + username.value + "/homepage";
		window.location.replace(new_url);
	});
});
