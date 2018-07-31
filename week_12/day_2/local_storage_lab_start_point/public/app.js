var init = function () {
  var button = document.querySelector('button');
  button.addEventListener('click', handleButtonClick);

  var todosArray = JSON.parse(localStorage.getItem('todoList')) || [];
  populate(todosArray);


}

var populate = function (todos) {
  // this function needs to:
  // - loop through the array of todos, invoking addItem() for each todo item
  for (var item of todos){
    addItem(item);
  };
}

var clearInput = function(id, text){
  var span = document.querySelector(id);
  span.innerText = text;
}

var addItem = function (item) {
  var colors = ['#ff7eb9','#7afcff','#feff9c','#FFF740'];
  var rotations = ['rotate(1deg)', 'rotate(2deg)', 'rotate(3deg)', 'rotate(-1deg)', 'rotate(-2deg)', 'rotate(-3deg)', 'rotate()'];
  var ul = document.querySelector('#todo-list');
  // this function needs to:
  // - create an li element containing the string 'item'
  var li = document.createElement('li');
  li.innerText = item;
  li.style.background = colors[Math.floor(Math.random()*colors.length)];
  li.style.transform =  rotations[Math.floor(Math.random()*rotations.length)];
  // - append the li to the "todo-list" ul
  ul.appendChild(li);
}

var handleButtonClick = function () {
  // this function needs to:
  // - get hold of the input box's value
  var newItem = document.querySelector('#new-item').value;

  // - append it to the "todo-list" ul by invoking addItem()
  addItem(newItem);

  // - add it to local storage by invoking save()
  save(newItem);

  // - clear box value to avoid repeat entries
  document.getElementById('new-item').value = "";
}

var save = function (newItem) {

  // this function needs to:
  // - get the data back from local storage and parse to an array
  var todosArray = JSON.parse(localStorage.getItem('todoList'));
  if (todosArray == null){
    todosArray = [];
  };

  // - add the newItem to the array
  todosArray.push(newItem);

  // - stringify the updated array
  var jsonString = JSON.stringify(todosArray);

  // - save it back to localstoage
  localStorage.setItem('todoList', jsonString);

}

window.addEventListener('load', init);
