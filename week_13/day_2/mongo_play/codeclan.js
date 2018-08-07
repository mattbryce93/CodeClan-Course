use codeclan;
db.dropDatabase();

db.students.insert([
  {
    name: "Pete",
    favFood: "chillie"
  },
  {
    name: "Adri",
    favFood: "lasagne"
  }
]);

// db.students.find()

db.instructors.insert([
  {
    name: "Steve",
    favFood: "curry"
  },
  {
    name: "John",
    favFood: "tofu"
  }
]);

show collections;

db.instructors.distinct("name");

db.instructors.save({ "_id" : ObjectId("5b6963a8c96af24c44ccc9d1"), "name" : "Steve", "favFood" : "curry" });

db.instructors.find();
