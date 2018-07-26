// hero model

const _ = require("lodash");

const Hero = function(name, favFood){
  this.name = name;
  this.health = 100;
  this.favFood = favFood;
  this.tasks = [];
};

Hero.prototype.talk = function () {
  return `Greetings, I am ${this.name}!`
};

Hero.prototype.eat = function(food){
  if (food.poisoned){
    this.health -= 20
  }else {
    if (food.name === this.favFood){
      this.health += 1.5 * food.value;
    } else {
      this.health += food.value;
    }
  }
};

Hero.prototype.addTask = function(task){
  this.tasks.push(task);
};

Hero.prototype.getTasksByCriteria = function(criteria){
  return _.orderBy(this.tasks, criteria);
};

Hero.prototype.viewByTaskStatus = function(status){
  return _.filter(this.tasks, ['isComplete', status]);
}

module.exports = Hero;
