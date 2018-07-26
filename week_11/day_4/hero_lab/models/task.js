// task model
const _ = require("lodash");

const Task = function(difficultyLevel, urgencyLevel, reward){
  this.difficultyLevel = difficultyLevel;
  this.urgencyLevel = urgencyLevel;
  this.reward = reward;
  this.isComplete = false;
};

Task.prototype.complete = function(){
  this.isComplete = true;
}


module.exports = Task;
