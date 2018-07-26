// food model

const _ = require("lodash");

const Food = function(name, value){
  this.name = name;
  this.value = value;
  this.poisoned = false;
};

module.exports = Food;
