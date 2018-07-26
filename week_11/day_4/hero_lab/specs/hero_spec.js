// hero specs
const assert = require("assert");
const Hero = require("../models/hero");
const Food = require("../models/food");
const Task = require("../models/task");
const Rat = require("../models/rat");

describe("Hero", function(){
    let hero, food1, task1, task2, task3, task4, task5, rat;

    beforeEach(function(){
        hero = new Hero('Gallahad', 'Fried Beans');
        food1 = new Food('Tacos', 50);
        food2 = new Food('Fried Beans', 30);
        task1 = new Task(1, 2, 50);
        task2 = new Task(2, 3, 100);
        task3 = new Task(3, 2, 200);
        task4 = new Task(1, 1, 100);
        task5 = new Task(3, 2, 150);
        rat = new Rat();
    });

    it("should have a name", function(){
      assert.deepStrictEqual(hero.name, 'Gallahad');
    })

    it("should have health at 100", function(){
      assert.deepStrictEqual(hero.health, 100);
    })

    it("should have a favourite food", function(){
      assert.deepStrictEqual(hero.favFood, 'Fried Beans');
    })

    it("should start with zero tasks", function(){
      assert.deepStrictEqual(hero.tasks, []);
    });

    it("should be able to talk", function(){
      assert.deepStrictEqual(hero.talk(), "Greetings, I am Gallahad!");
    });

    it('can eat food and increase health', function(){
      hero.eat(food1);
      assert.deepStrictEqual(hero.health, 150);
    });

    it('can eat favourite food and health goes up by 1.5 * food value', function(){
      hero.eat(food2);
      assert.deepStrictEqual(hero.health, 145);
    });

    it('can add tasks', function(){
      hero.addTask(task1);
      assert.deepStrictEqual(hero.tasks, [task1]);
    });

    it('can sort tasks by difficulty', function(){
      hero.addTask(task1);
      hero.addTask(task2);
      hero.addTask(task3);
      hero.addTask(task4);
      hero.addTask(task5);
      assert.deepStrictEqual(hero.getTasksByCriteria('difficultyLevel'), [task1, task4, task2, task3, task5]);
    });

    it('can sort tasks by urgency', function(){
      hero.addTask(task1);
      hero.addTask(task2);
      hero.addTask(task3);
      hero.addTask(task4);
      hero.addTask(task5);
      assert.deepStrictEqual(hero.getTasksByCriteria('urgencyLevel'), [task4, task1, task3, task5, task2]);
    });

    it('can sort tasks by reward', function(){
      hero.addTask(task1);
      hero.addTask(task2);
      hero.addTask(task3);
      hero.addTask(task4);
      hero.addTask(task5);
      assert.deepStrictEqual(hero.getTasksByCriteria('reward'), [task1, task2, task4, task5, task3]);
    });

    it('can see all completed tasks', function(){
      hero.addTask(task1);
      hero.addTask(task2);
      hero.addTask(task3);
      hero.addTask(task4);
      hero.addTask(task5);
      task2.complete();
      task3.complete();
      assert.deepStrictEqual(hero.viewByTaskStatus(true), [task2, task3]);
    });

    it('can see all incompleted tasks', function(){
      hero.addTask(task1);
      hero.addTask(task2);
      hero.addTask(task3);
      hero.addTask(task4);
      hero.addTask(task5);
      task2.complete();
      task3.complete();
      assert.deepStrictEqual(hero.viewByTaskStatus(false), [task1, task4, task5]);
    });

    it('should lose health after eating poisoned food', function(){
      rat.touchFood(food1);
      hero.eat(food1);
      assert.deepStrictEqual(hero.health, 80);
    });

});
