console.log("hello world");

window.addEventListener('load', () => {
    const form = document.querySelector("#login-form");
    const username = document.querySelector("#username");
    const password = document.querySelector("#password");

	form.addEventListener('submit', (e) => {
        e.preventDefault();

        console.log(username.value);
        console.log(password.value);
        
        var new_url = "http://localhost:8080/api/card/" + username.value;
        window.location.replace(new_url);

	});
});

