var myPerson = Object.create(null);
myPerson.walk = function(){
  console.log('left right left right');
}

var wisePerson = {
  wisdom: function(){
    console.log('commit often');
  }
}

var myPerson = Object.create(wisePerson);
myPerson.walk = function(){
  console.log('left right left right');
}

// myPerson.wisdom();
// myPerson.walk();

var Fish = function(name, colour){
  this.name = name;
  this.colour = colour;
}

Fish.prototype = {
  swim: function(){
    console.log('splash');
  }
}

fish1 = new Fish('Nemo', 'Orange');

fish1.swim();

//ES6 syntax
var proto = Object.getPrototypeOf(fish1);
console.log(proto);

//deprecated syntax
var oldProto = fish1.__proto__
console.log(oldProto);
