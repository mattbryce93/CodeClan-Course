const QuoteView = require('./views/quoteView');
const Request = require('./services/request.js');

const quoteView = new QuoteView();
const request = new Request("http://localhost:3000/api/quotes");

const getQuotesRequestComplete = function(allQuotes){
  for(let quote of allQuotes){
    quoteView.addQuote(quote);
  }
};

const createRequestComplete = function(newQuote){
  quoteView.addQuote(newQuote);
};

const deleteAllRequestComplete = function(){
  quoteView.clear();
}

const createButtonClicked = function(event){
  event.preventDefault();
  const nameInputValue = document.querySelector('#name').value;
  const quoteInputValue = document.querySelector('#quote').value;
  const quoteToSend = {
    name: nameInputValue,
    quote: quoteInputValue
  };
  request.post(createRequestComplete, quoteToSend);
};

const deleteAllButtonClicked = function(){
  request.delete(deleteAllRequestComplete);
};

const appStart = function(){
  request.get(getQuotesRequestComplete);
  const createQuoteButton = document.querySelector('#submit-quote');
  createQuoteButton.addEventListener('click', createButtonClicked);
  const deleteAllButton = document.querySelector('#deleteButton');
  deleteAllButton.addEventListener('click', deleteAllButtonClicked);
  const 
};

document.addEventListener('DOMContentLoaded', appStart);
