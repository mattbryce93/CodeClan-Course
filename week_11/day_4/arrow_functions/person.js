const Person = function(){
  this.age = 10;

  //This requires a bind to work
  // setInterval((function(){
  //   this.age += 1;
  //   console.log("My age is: " + this.age);
  // }).bind(this),1000); //Manky bind is manky

  //This does not require a bind to work
  setInterval(() => {
    this.age +=1;
    console.log("My age is: " + this.age);
  }, 1000);

};

//This works
Person.prototype.printAge = function(){
  console.log(`I am ${this.age} years old`);
}

//This does not work
// Person.prototype.printAge = () => {
//   console.log(`I am ${this.age} years old`);
// }

let matt = new Person();
matt.printAge();
