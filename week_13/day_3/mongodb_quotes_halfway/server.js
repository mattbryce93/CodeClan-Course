const express = require('express');
const parser = require('body-parser');
const server = express();
const MongoClient = require('mongodb').MongoClient;
const ObjectID = require('mongodb').ObjectID;

server.use(parser.json());
server.use(express.static('client/build'));
server.use(parser.urlencoded({extended: true}));


// Connecting to the database
MongoClient.connect('mongodb://localhost:27017', function(err, client) {
  if (err) {
    console.log(err);
    return;
  }
  const db = client.db("star_wars");

  console.log('Connected to database');

  // CREATE route
  server.post('/api/quotes', function(req, res){
    const quotesCollection = db.collection('quotes');
    const quoteToSave = req.body;
    quotesCollection.save(quoteToSave, function(err, result){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }

      console.log('saved to database');
      res.status(201);
      res.json(result.ops[0]);
    });
  });

  // READ route
  server.get('/api/quotes', function(req, res){
    const quotesCollection = db.collection('quotes');
    quotesCollection.find().toArray(function(err, allQuotes){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }

      res.json(allQuotes);
    });
  });

  // DELETE route
  server.delete('/api/quotes', function(req, res){
    const filterObject = {};
    const quotesCollection = db.collection('quotes');
    quotesCollection.deleteMany(filterObject, function(err, result){
      if(err){
        res.status(500);
        res.send();
      }

      res.status(204);
      res.send();
    });
  });

  // UPDATE route
  server.put('/api/quotes/:id', function(req, res){
    const quotesCollection = db.collection('quotes');
    const objectID = ObjectID(req.params.id);
    const filterObject = {_id: objectID};
    const updatedData = req.body;
    quotesCollection.update(filterObject, updatedData, function(err, result){
      if(err){
        res.status(500);
        res.send();
      }

      res.status(204);
      res.send();
    });
  });

  server.listen(3000, function(){
    console.log("Listening on port 3000");
  });
})
