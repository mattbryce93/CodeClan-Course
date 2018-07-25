var EnumLib = require('../enumeration.js');

var assert = require('assert');

describe('My Enumeration Library', function() {

  var myEnumLib = new EnumLib();

  var testArrayOfNumbers = [ 1, 2, 3, 4, 5, 6 ];
  var testArrayOfObjects = [
    { name: "John", instrument: "guitar" },
    { name: "Paul", instrument: "bass guitar" },
    { name: "George", instrument: "guitar" },
    { name: "Ringo", instrument: "drums" }
  ];

  it("can find an item in an array (the Beatle who plays drums)", function() {
    let foundBeatle = myEnumLib.find( testArrayOfObjects, function( beatle ) {
      return beatle.instrument === "drums";
    });
    assert.deepEqual( foundBeatle, { name: "Ringo", instrument: "drums" } )
  });

  it("can map an array (to doubles of the items)", function() {
    let doubledArray = myEnumLib.map( testArrayOfNumbers, function( number ) {
      return number * 2;
    });
    assert.deepEqual( doubledArray, [ 2, 4, 6, 8, 10, 12 ])
  });

  it("can filter an array (to only even numbers)", function() {
    let evenNumbers = myEnumLib.filter( testArrayOfNumbers, function( number ) {
      return number % 2 === 0;
    });
    assert.deepEqual( evenNumbers , [ 2, 4, 6 ])
  });

  it("returns true if *some* elements meet a condition", function() {
    let some1 = myEnumLib.some( testArrayOfNumbers, function( number ) {
      return number > 3;
    });
    let some2 = myEnumLib.some( testArrayOfNumbers, function( number ) {
      return number > 100;
    });
    assert.equal( some1 , true );
    assert.equal( some2 , false );
  });

  it("returns true if *every* element meets a condition", function() {
    let every1 = myEnumLib.every( testArrayOfNumbers, function( number ) {
      return number > 0;
    });
    let every2 = myEnumLib.every( testArrayOfNumbers, function( number ) {
      return number > 3;
    });
    assert.equal( every1 , true )
    assert.equal( every2 , false )
  });

  it("can reduce an array (to the sum of its items)", function() {
    let sum = myEnumLib.reduce( testArrayOfNumbers, function( a, b ) {
      return a + b;
    });
    assert.equal( sum , 21 ) // 1 + 2 + 3 + 4 + 5 + 6 === 21
  });

})
