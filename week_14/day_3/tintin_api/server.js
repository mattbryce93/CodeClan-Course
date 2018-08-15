const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const cors = require('cors');

const MongoClient = require('mongodb').MongoClient
const url = "mongodb://tintin:tintinpw123@ds115442.mlab.com:15442/tintin";

app.use(cors());
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

app.use(require('./controllers/index'));

app.use(express.static('public'));

MongoClient.connect(url, function(err, client){
	if(err){
		console.log(err);
		return;
	}

	const db = client.db('tintin');
	app.set("db", db);

	app.listen(process.env.PORT || 3001, function () {
		console.log('App running on port ' + this.address().port);
	});
});
