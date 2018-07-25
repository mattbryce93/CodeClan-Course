const assert = require('assert');
const WaterBottle = require('../water_bottle.js');
const Athlete = require('../athlete.js');

describe('Water Bottle', function(){

  let bottle;

  beforeEach(function() {
    bottle = new WaterBottle();
  });

  it('should be empty at start', function(){
    assert.strictEqual(bottle.volume, 0);
  });

  it('should go to 100 when filled', function(){
    bottle.fill();
    assert.strictEqual(bottle.volume, 100);
  });

  it('should go down by 10 when drank', function(){
    bottle.fill();
    bottle.drink();
    assert.strictEqual(bottle.volume, 90);
  });

  it('should go to 0 when emptied', function(){
    bottle.fill();
    bottle.empty();
    assert.strictEqual(bottle.volume, 0);
  });

  it('should not be able to go below 0', function(){
    bottle.drink();
    assert.strictEqual(bottle.volume, 0);
  });

});

describe('Athlete', function(){

  let athlete, bottle;

  beforeEach(function() {
    athlete = new Athlete();
    bottle = new WaterBottle();
  });

  it('Create and test a constructor for athlete objects.', function(){
    assert.strictEqual(athlete.typeof, Athlete());
  });

  it('Athlete should have a hydration attribute that starts at 100.', function(){
    assert.strictEqual(athlete.hydration, 100);
  });

  it('Athlete should have a distance covered attribute starts at 0.', function(){
    assert.strictEqual(athlete.distanceCovered, 0);
  });

  it('Athlete should be able to run: increasing distance, decreasing hydration.', function(){
    athlete.run(10);
    assert.strictEqual(athlete.hydration, 90);
    assert.strictEqual(athlete.distanceCovered, 10);
  });

  it('Athlete should not move when running dehydrated: hydration at 0.', function(){
    athlete.hydration = 0;
    athlete.run(10);
    assert.strictEqual(athlete.distanceCovered, 0);
  });

  it('Athlete should be able to increase hydration by drinking from water bottle', function(){
    athlete.hydration = 0;
    bottle.fill();
    athlete.drink(bottle);
    assert.strictEqual(athlete.hydration, 10);
    assert.strictEqual(bottle.volume, 90);
  });

});
