const express = require('express');
const router = new express.Router();

router.use('/cats', require('./cats'));
router.use('/dogs', require('./dogs'));

router.get('/', function(req, res){
  res.json({dats: "Welcome!"});
});

router.get('/about', function(req, res){
  res.json({data: "Here's what we're about!"});
});

module.exports = router;
