const express = require('express');
const parser = require('body-parser');
const server = express();
const MongoClient = require('mongodb').MongoClient;
const ObjectID = require('mongodb').ObjectID;

server.use(parser.json());
server.use(express.static('client/build'));
server.use(parser.urlencoded({extended:true}));

MongoClient.connect('mongodb://localhost:27017', function(err, client){
  if(err){
    console.log(err);
    return;
  }
  const db = client.db('spacelaunchesdb');
  console.log('Connected to database');

  server.get('/api/launches', function(req, res){
    const launchCollection = db.collection('launches');
    launchCollection.find().toArray(function(err, allLaunches){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      res.status(201);
      res.json(allLaunches);
      res.send();
    })
  });

  server.post('/api/launches', function(req, res){
    const launchCollection = db.collection('launches');
    const launchToSave = req.body;
    launchCollection.save(launchToSave, function(err, result){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      console.log('Saved to database');
      res.status(201);
      res.json(result.ops[0]);
      res.send();
    });
  });

  server.delete('/api/launches', function(req, res){
    const launchCollection = db.collection('launches');
    launchCollection.deleteMany(function(err, result){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      console.log('Deleted all objects in database');
      res.status(204);
      res.send();
    })
  });

  server.put('/api/launches/:id', function(req,res){
    const launchCollection = db.collection('launches');
    const objectID = ObjectID(req.params.id);
    const filterObject = {_id: objectID};
    const updatedData = req.body;
    launchCollection.update(filterObject, updatedData, function(err, result){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      console.log('Updated object in database');
      res.status(204);
      res.send();
    })
  });

  server.listen(3000, function(){
    console.log("Listening on port 3000");
  });
});
