var counter = 0;

var handleButtonClick = function(){
  counter += 1;
  var pTag = document.querySelector('#button-result');
  pTag.innerText = `Woa dude, I totally got clicked ${counter} times!`
};

var handleKeyPress = function(){
  var pTag = document.querySelector('#text-result');
  pTag.innerText = this.value;
};

var handleSelectChanged = function(){
  console.log(event);
  var pTag = document.querySelector('#select-result');
  pTag.innerText = `${this.value}, excellent!`;
};


var app = function(){
  var button = document.querySelector('button');
  button.addEventListener('click', handleButtonClick);

  var input = document.querySelector('input');
  input.addEventListener('keyup', handleKeyPress);

  var select = document.querySelector('select');
  select.addEventListener('change', handleSelectChanged);
}

window.addEventListener('load', app);
