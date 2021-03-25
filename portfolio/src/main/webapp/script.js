// navigation toggle
const nav_toggle = document.querySelector('.nav-toggle');
const navLinks = document.querySelectorAll('.nav__link')

nav_toggle.addEventListener('click', () => {
  document.body.classList.toggle('nav-open');
})

navLinks.forEach(link => {
  link.addEventListener('click', () =>{
    document.body.classList.remove('nav-open');
  })
})

// makes fetch call to server and updates html with response
async function requestFavQuotes() {
    const response = await fetch('/favQuotes');
    const quotes = await response.json();
    // const quotes = JSON.parse(jsonResponse);

    // pick a random quotes
    const randomQuote = quotes[Math.floor(Math.random() * Math.floor(quotes.length))];

    // update html tag
    const messageContainer = document.getElementById('message-container');
    messageContainer.innerHTML = randomQuote;
}

