// task specs
const assert = require("assert");
const Task = require("../models/task");

describe("Task", function(){
  let task1;
  let task2;
  let task3;
  let task4;

  beforeEach(function(){
      task1 = new Task(1, 2, 50);
      task2 = new Task(2, 3, 100);
      task3 = new Task(3, 3, 200);
      task4 = new Task(1, 3, 100);
  });

  it('should have a difficulty level', function(){
    assert.deepStrictEqual(task1.difficultyLevel, 1);
  });

  it('task is complete', function(){
    assert.deepStrictEqual(task1.isComplete, false)
  });

});
