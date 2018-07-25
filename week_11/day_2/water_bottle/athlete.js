const Athlete = function() {
  this.hydration = 100;
  this.distanceCovered = 0;
};

Athlete.prototype.run = function(distance) {
  if (this.hydration >= distance) {
    this.distanceCovered += distance;
    this.hydration -= distance;
  } else {
    this.distanceCovered += this.hydration;
    this.hydration = 0;
  }
}

Athlete.prototype.drink = function(waterBottle) {
  waterBottle.drink();
  this.hydration += 10;
}

module.exports = Athlete;
