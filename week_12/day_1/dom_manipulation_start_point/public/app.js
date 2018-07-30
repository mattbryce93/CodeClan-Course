var QUOTES_ARRAY = [
  {quote: "76% of statistics on the internet are made up on the spot ", author: "Abraham Lincoln"},
  {quote: "Crop rotation in the 14th century was considerably more widespread after... ", author: "Rick"},
  {quote: "You don't wake up in the morning and think; What can I spanner? ", author: "Stephen Hawking"}]


// var app = function() {
//     // var dayQuote = document.getElementById('quote-of-the-day');
//     // dayQuote.style.display = 'none';
//     //
//     // var quotes = document.getElementsByTagName('article');
//     // for (var i = 0; i < quotes.length ; i++){
//     //     quotes[i].style.backgroundColor = 'dodgerblue';
//     //   }
//
//     for (var quote of QUOTES_ARRAY){
//       addQuote(quote.author, quote.quote);
//     }
//
// };

var addQuote = function(author, quoteText){
  var quoteArticle = createQuoteArticle();
  var blockquote = createBlockQuote(quoteText);
  var cite = createCite(author);
  appendElements(quoteArticle, blockquote, cite);
};

var createQuoteArticle = function(){
  var quoteArticle = document.createElement('article');
  quoteArticle.classList.add('quote');
  return quoteArticle;
};

var createBlockQuote = function(quoteText){
  var blockquote = document.createElement('blockquote');
  blockquote.innerText = quoteText;
  return blockquote;
};

var createCite = function(author){
  var cite = document.createElement('cite');
  cite.innerText = author;
  return cite;
};

var appendElements = function(quoteArticle, blockquote, cite){
  blockquote.appendChild(cite);
  quoteArticle.appendChild(blockquote);
  var quotes = document.querySelector('#quotes');
  quotes.appendChild(quoteArticle);
};

var app = function() {
    for (var quote of QUOTES_ARRAY){
      addQuote(quote.author, quote.quote);
    }
};

window.onload = app;
