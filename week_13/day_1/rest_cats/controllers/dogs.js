const express = require('express');
const dogRouter = express.Router();

let dogs = ["Patch", "Spot", "Fido"];

//show the dog
dogRouter.get('/:id', function(req, res){
  let index = req.params.id;
  res.json({data: dogs[index]});
});

//index all the dogs
dogRouter.get('/', function(req, res){
  res.json(dogs);
});

// create = make a new dog
dogRouter.post('/', function(req, res){
  dogs.push(req.body.dog);
  res.json(dogs);
});

// UPDATE
dogRouter.put('/:id', function(req, res){
  let index = req.params.id;
  dogs[index] = req.body.dog;
  res.json(dogs);
});

// DELETE - destroy an awesome dog
dogRouter.delete('/:id', function(req, res){
  let index = req.params.id;
  dogs.splice(index, 1);
  res.json(dogs);
});

module.exports = dogRouter;
