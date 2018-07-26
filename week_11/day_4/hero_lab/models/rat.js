// rat model

const _ = require("lodash");

const Rat = function(){
};

Rat.prototype.touchFood = function(food){
  food.poisoned = true;
};

module.exports = Rat;
