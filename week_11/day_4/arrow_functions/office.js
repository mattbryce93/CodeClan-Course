// For constructors always use the full function, not the arrow functions as the scope of `this` changes with it


// Use this
const Office = function(numDesks, numBathrooms){
  this.numDesks = numDesks;
  this.numBathrooms = numBathrooms;
}

// Do not use this
const Office = (numDesks, numBathrooms) => {
  this.numDesks = numDesks;
  this.numBathrooms = numBathrooms;
}
