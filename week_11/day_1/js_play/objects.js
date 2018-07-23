// var myPerson = {
//   name: 'Guybrush',
//   age: 32,
//   weapon: 'cutlass',
//   talk: function(){
//     console.log("Shiver me timbers, it's me: " + this.name);
//   }
// };
// //
// // console.log({myPerson});
// //
// // console.log(myPerson.weapon);
//
// myPerson.name = 'Guybrush Threepwood';
// myPerson.age = 1;
// myPerson.occupation = 'mighty pirate';
//
// // console.log({myPerson});
// //
// // myPerson.talk();
//
// var object = {};
//
// var anotherObject = Object.create(null);
//
// var yetAnotherObject = new Object();
// //
// // console.log(myPerson['name']);
//
// var keyToAccess = 'age';
//
// // console.log(myPerson[keyToAccess]);
//
// var keys = Object.keys(myPerson);
//
// for (var key of keys){
//   console.log('key:', key, 'value', myPerson[key]);
// }
//
// console.log(keys);

// Create a bear object that has a type, a name, a belly and an eat method. The eat method should add something to the bear's belly.

var bear = {
  type: "Grizzly",
  name: "Yogi",
  belly: [],
  eat: function(food){
    this.belly.push(food);
  }
};

// console.log({bear});

bear.eat("Salmon");

// console.log({bear});
//
// console.log(bear.belly);


// ```Define an anonymous function expression that takes two arguments:
//
// an object, for example, { name: 'Wojtek', age: 30 }
// a string, for exmaple, 'name'
// Your function should return true if the given string is a key on the given object and false if the object does not have a key that matches the string. Store this function in an appropriately named variable to invoke it.```

var checkForKey = function(object, string){

  var keys = Object.keys(object);
  for (var key of keys){
    if (key === string){
      return true;
    }
  }

  // Secondary way using in loop, useful for hashes.
  // for (var key in object){
  //   if (key === string){
  //     return true;
  //   }
  // }

  return false;
}

console.log(checkForKey(bear, 'name'));

console.log(checkForKey(bear, 'claws'));
