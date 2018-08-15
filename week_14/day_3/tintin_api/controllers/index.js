const express = require('express');
const router = express.Router();

router.use('/books', require('./books'));
router.use('/insults', require('./insults'));

router.get('/', function (req, res) {
  res.json({"data": "Tintin API"});
});

module.exports = router;