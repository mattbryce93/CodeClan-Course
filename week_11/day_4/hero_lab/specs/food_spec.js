// food specs
const assert = require("assert");
const Food = require("../models/food");
const Rat = require("../models/rat");

describe("Food", function(){
    let food, rat;

    beforeEach(function(){
        food = new Food('Tortillas', 30);
        rat = new Rat();
    });

    it("should have a name", function(){
      assert.deepStrictEqual(food.name, 'Tortillas');
    });

    it("should have replenishment value", function(){
      assert.deepStrictEqual(food.value, 30);
    });

    it("should start not poisoned", function(){
      assert.deepStrictEqual(food.poisoned, false);
    });

    it("should spoil after rat touches", function(){
      rat.touchFood(food);
      assert.deepStrictEqual(food.poisoned, true);
    });

});
