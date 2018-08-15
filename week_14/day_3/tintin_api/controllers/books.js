const express = require('express');
const bookRouter = express.Router();
const _ = require("lodash");

bookRouter.get("/", function(req, res){
    const db = req.app.get("db");

    const books = db.collection("books");

    books.find().toArray(function(err, bookObjects){
        if(err) {
            console.log(err);
            res.status(500)
            res.send();
        }

        res.json(_.sortBy(bookObjects, "released"));
    });
});

module.exports = bookRouter;