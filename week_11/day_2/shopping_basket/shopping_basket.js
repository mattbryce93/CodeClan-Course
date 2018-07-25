const ShoppingBasket = function(){
  this.items = [];
};

ShoppingBasket.prototype.addItem = function(item) {
  if (item.discount){
    if (this.items.includes(item)){
      item.price /-= 2;
      this.items.push(item);
    } else {
      this.items.push(item);
    }
  } else {
      this.items.push(item);
  }
}

ShoppingBasket.prototype.removeItem = function(item) {
  index = this.items.indexOf(item);
  this.items.splice(index, 1);
}

ShoppingBasket.prototype.totalCost = function(hasCard = false) {
  total = 0;
  for (item of this.items){
    total += item.price;
  }
  finalPrice = total;
  if (total > 20){
    finalPrice -= total * 0.1;
  }
  if (hasCard){
    finalPrice -= total * 0.05;
  }
  return parseFloat(finalPrice.toFixed(2));
}

module.exports = ShoppingBasket;
