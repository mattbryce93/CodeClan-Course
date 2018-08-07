var QuoteView = function(){
  this.quotes = [];
}

QuoteView.prototype.addQuote = function(quote) {
  this.quotes.push(quote);
  this.render(quote);
}

QuoteView.prototype.clear = function(quote) {
  this.quotes = [];
  const ul = document.querySelector('#quotes');
  ul.innerHTML = '';
}

QuoteView.prototype.render = function(quote){
    const ul = document.querySelector('#quotes');
    const li = document.createElement('li');
    const text = document.createElement('p');
    text.innerText = `${quote.name} - "${quote.quote}"`;
    li.appendChild(text);
    ul.appendChild(li);
}

 module.exports = QuoteView;
