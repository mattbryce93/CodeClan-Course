const makeRequest = function(url, callback){
  //create a new XMLHttpRequest object
  const request = new XMLHttpRequest();
  //set the type of request we want with the url we want to call
  request.open("GET", url);
  //set the callback we want to use when the call is complete
  request.addEventListener('load', callback);
  //send the request
  request.send();
};

const requestOneCountry = function(url, callback){
  let selectTag = document.getElementById('select-country');
  var value = selectTag.options[selectTag.selectedIndex].value;
  const request = new XMLHttpRequest();
  url += value;
  //set the type of request we want with the url we want to call
  request.open("GET", url);
  //set the callback we want to use when the call is complete
  request.addEventListener('load', callback);
  //send the request
  request.send();
};

const requestOneComplete = function(){
  //this is the request object itself
  if(this.status!=200) return;
  //grab the response text
  const jsonString = this.responseText;
  const country = JSON.parse(jsonString);
  processSelectChange(country);
};

const requestComplete = function(){
  //this is the request object itself
  if(this.status!=200) return;
  //grab the response text
  const jsonString = this.responseText;
  const countries = JSON.parse(jsonString);
  populateOptions(countries);
};

//broken method if no local storage exists

const populateOptions = function(countries){
  var lastSelected = localStorage.getItem('lastSelected');
  lastSelected = JSON.parse(lastSelected);
  console.log(lastSelected);

  let selectTag = document.getElementById('select-country');
  countries.forEach(function(country){
    let optionTag = document.createElement('option');
    optionTag.innerText = country.name;
    optionTag.value = country.alpha3Code;
    if(optionTag.value === lastSelected.alpha3Code){
      optionTag.selected = true;
    };
    selectTag.appendChild(optionTag);
  });
};

const processSelectChange = function(country){

  var string = JSON.stringify(country)
  localStorage.setItem('lastSelected', string);

  let h3Tag = document.getElementById('country-name');
  h3Tag.innerText = `${country.name}`;

  let flagTag = document.getElementById('country-flag');
  flagTag.src = country.flag;

  let popTag = document.getElementById('country-population');
  popTag.innerText = `Population: ${country.population}`;

  let capTag = document.getElementById('country-capital');
  capTag.innerText = `Capital: ${country.capital}`;

};

var app = function(){
  const url1 = 'https://restcountries.eu/rest/v2/all';
  const url2 = 'https://restcountries.eu/rest/v2/alpha/'

  makeRequest(url1, requestComplete);

  var lastSelected = localStorage.getItem('lastSelected');
  lastSelected = JSON.parse(lastSelected);

  let h3Tag = document.getElementById('country-name');
  h3Tag.innerText = `${lastSelected.name}`;

  let flagTag = document.getElementById('country-flag');
  flagTag.src = lastSelected.flag;

  let popTag = document.getElementById('country-population');
  popTag.innerText = `Population: ${lastSelected.population}`;

  let capTag = document.getElementById('country-capital');
  capTag.innerText = `Capital: ${lastSelected.capital}`;

  let selectTag = document.getElementById('select-country');





  selectTag.addEventListener('change', function(){
    requestOneCountry(url2, requestOneComplete);
  });

};

window.addEventListener('load', app);
