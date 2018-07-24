var myObject = {};
myObject.shape = 'circle';
myObject.radius = 10;

var myOtherObject = new Object();
myOtherObject.size = 6;
myOtherObject.color = 'red';

var house1 = {
  sqFeet: 2000,
  bathrooms: 2,
  bedrooms: 3
}

var house2 = {
  sqFeet: 2000,
  bathrooms: 2,
  bedrooms: 3
}

var house3 = {
  sqFeet: 2000,
  bathrooms: 2,
  bedrooms: 3
}

var House = function(sqFeet, bathrooms, bedrooms){
  this.sqFeet = sqFeet;
  this.bathrooms = bathrooms;
  this.bedrooms = bedrooms;
  this.numberOfRooms = function(){
    return(this.bathrooms + this.bedrooms);
  }
}

var house1 = House(1000, 3, 4);
var house2 = House(2000, 4, 5);
var house3 = House(3000, 5, 6);

var Office = function(desks, meetingRooms){
  this.desks = desks;
  this.meetingRooms = meetingRooms;
  this.averageDesksPerMeetingRoom = function(){
    return this.desks / this.meetingRooms;
  };
};

var office1 = new Office(100, 10);
var office2 = new Office(2, 2);

// console.log(office1);
// console.log(office1.averageDesksPerMeetingRoom());
// console.log(office2);
// console.log(office2.averageDesksPerMeetingRoom());

var Planet = function(name){
  this.name = name;
};

var System = function(name){
  this.name = name;
  this.planets = [];
  this.addPlanet = function(planet){
    this.planets.push(planet);
  };
};

var planet1 = new Planet('Mercury');
var planet2 = new Planet('Venus');
var planet3 = new Planet('Earth');
var planet4 = new Planet('Mars');
var planet5 = new Planet('Jupiter');
var planet6 = new Planet('Saturn');
var planet7 = new Planet('Uranus');
var planet8 = new Planet('Neptune');

var system1 = new System('Sol System');

system1.addPlanet(planet1);
system1.addPlanet(planet2);
system1.addPlanet(planet3);
system1.addPlanet(planet4);
system1.addPlanet(planet5);
system1.addPlanet(planet6);
system1.addPlanet(planet7);
system1.addPlanet(planet8);
console.log(system1.planets);
