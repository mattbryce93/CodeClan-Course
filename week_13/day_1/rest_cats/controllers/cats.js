const express = require('express');
const catRouter = express.Router();

let cats = ["Bengal", "British Shorthair", "Siamese"];

//show the cat
catRouter.get('/:id', function(req, res){
  let index = req.params.id;
  res.json({data: cats[index]});
});

//index all the cats
catRouter.get('/cats', function(req, res){
  res.json(cats);
});

// create = make a new cat
catRouter.post('/', function(req, res){
  cats.push(req.body.cat);
  res.json(cats);
});

// UPDATE
catRouter.put('/:id', function(req, res){
  let index = req.params.id;
  cats[index] = req.body.cat;
  res.json(cats);
});

// DELETE - destroy a stupid cat
catRouter.delete('/:id', function(req, res){
  let index = req.params.id;
  cats.splice(index, 1);
  res.json(cats);
});

module.exports = catRouter;
