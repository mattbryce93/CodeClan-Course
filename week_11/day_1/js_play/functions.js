function sayHello(greeting, name = 'World'){
  return `${greeting} ${name}!`;
}

console.log('sayHello() message:', sayHello("Hello", "Matthew"));

var add = function(firstNumber, secondNumber){
  return firstNumber + secondNumber;
}

console.log('1 + 3 with add:', add(1,3));

function addAll(numbers){
  var total = 0;
  for (var number of numbers){
    total += number;
  }
  return total;
}

var allNumbers = [1,2,3,4,5,6,7,8,9];

console.log('addAll function with Array [1,2,3,4,5,6,7,8,9]:',addAll(allNumbers));

var multiply = (firstNumber, secondNumber) => firstNumber * secondNumber;

console.log(multiply(2, 5));
