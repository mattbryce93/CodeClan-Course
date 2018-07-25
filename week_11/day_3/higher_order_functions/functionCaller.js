// 1. Write a function, *functionCaller*, that takes a function (myCallback) and a number as parameters. The *functionCaller* returns myCallback called with the number (as an argument).

// const functionCaller = function(myCallBack, number){
//   return myCallBack(number);
// };

// 2. **Maths Fun:** Write two functions *increment* and *square*. *increment* should take in a number and return the number plus 1. *square* should take in a number and return it multiplied by itself.

const increment = function(num){
  return num + 1;
};

const square = function(num){
  return num ** 2;
};

// Write another function called *doSomeMathsForMe* that takes in a number (*n*) and a function (a callback) and executes the callback, passing in *n* as an argument.

const doSomeMathsForMe = function(num, callBack){
  return callBack(num);
};

console.log(doSomeMathsForMe(2, increment));
console.log(doSomeMathsForMe(2, square));
