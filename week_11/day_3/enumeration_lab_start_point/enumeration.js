var Enumeration = function() {}

Enumeration.prototype.forEach = function(array, callback){
  for (var item of array){
    callback(item);
  }
};

Enumeration.prototype.find = function(array, booleanFunction) {
  let foundItem = null;
  this.forEach(array, function(item){
    if (booleanFunction(item)){
      foundItem = item;
    }
  })
  return foundItem;
};

Enumeration.prototype.map = function(array, mathFunction) {
  let endArray = [];
  this.forEach(array, function(item){
    endArray.push(mathFunction(item));
  })
  return endArray;
};

Enumeration.prototype.filter = function(array, booleanFunction){
  let filteredItems = [];
  this.forEach(array, function(item){
    if (booleanFunction(item)){
      filteredItems.push(item);
    }
  })
  return filteredItems;
};

Enumeration.prototype.some = function(array, conditionFunction){
  let result = false;
  this.forEach(array, function(item){
    if (conditionFunction(item)){
      result = true;
    }
  })
  return result;
};

Enumeration.prototype.every = function(array, conditionFunction){
  let result = true;
  this.forEach(array, function(item){
    if (!conditionFunction(item)){
      result = false;
    }
  })
  return result;
};

Enumeration.prototype.reduce = function(array, mathFunction){
  let result = 0;
  this.forEach(array, function(item){
    result = mathFunction(result, item);
  })
  return result;
};

module.exports = Enumeration;
