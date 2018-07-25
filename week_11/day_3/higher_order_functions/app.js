//anonymous function - A function without a name

// const Park = function(){
//
// }


//has a two second delay before logging to the console
//when we're using a function in an argument, this is called a callback
//note that this function used here is also an anonymous function

// setTimeout(function(){
//   console.log("Hello from the past");
// }, 2000);

//test functions are an example of the same thing

// it('should do a thing', function(){
//
// });


// const sayHello = function(){
//     console.log("Hello from the past");
// };

// The brackets in this line after sayHello will cause it to Error as it will attempt to run immediatly

// setTimeout(sayHello(), 2000);

//Instead it should be typed as such as a variable as JS allows us to throw functions around like this

// setTimeout(sayHello, 2000);

//A named function - A function that has a name

//A higher order function either returns a function or accepts a function as an argument
