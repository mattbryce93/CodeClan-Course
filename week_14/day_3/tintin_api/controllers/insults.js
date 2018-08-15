const express = require('express');
const insultRouter = express.Router();
const sample = require("lodash/sample");

insultRouter.get("/", function(req, res){
    const db = req.app.get("db");

    const insults = db.collection("insults");
    
    insults.find().toArray(function(err, insults){
        if(err){
            console.log(err);
            res.status(500);
            res.send();
        }

        res.json(insults);
    });
});

insultRouter.get("/random", function(req, res){
    const db = req.app.get("db");
    const insults = db.collection("insults");
    insults.find().toArray(function(err, insults){
        if(err){
            console.log(err);
            res.status(500);
            res.send();
        }

        res.json(sample(insults));
    });
});

insultRouter.post("/", function(req, res){
    const db = req.app.get("db");
    const insults = db.collection("insults");

    const body = req.body;
    insults.insertOne(body, function(err, result){
        if(err){
            console.log(err);
            res.status = 500;
            re.send();
        }

        res.json(result.ops[0]);
    });
});

module.exports = insultRouter;