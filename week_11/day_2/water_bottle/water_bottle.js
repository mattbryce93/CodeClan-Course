const WaterBottle = function(){
  this.volume = 0;
};

WaterBottle.prototype.fill = function(){
    this.volume = 100;
};

WaterBottle.prototype.drink = function(){
  if (this.volume >= 10) {
    this.volume -= 10;
  }
};

WaterBottle.prototype.empty = function(){
    this.volume = 0;
};

module.exports = WaterBottle;
