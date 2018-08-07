use farm;
db.dropDatabase();

db.animals.insert({
  name: "Erik",
  type: "Polar Bear"
});

db.animals.insert({
  name: "Hobbes",
  type: "Sumatran Tiger"
});

db.animals.insert({
  name: "Fergus",
  type: "Cow"
});

//this return all entries in the animals db
// db.animals.find();

// please note that the string is case sensitive "hobbes" returns no object
// db.animals.find({name: "Hobbes"});

db.animals.update(
  {name: "Erik"},
  {$set: {type: "Horse"}}
);

db.animals.remove({name: "Erik"});
