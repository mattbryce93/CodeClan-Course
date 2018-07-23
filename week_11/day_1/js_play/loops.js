var pets = ["dog", "cat", "parrot"];

for(var i=0; i<pets.length; i++){
  console.log(pets[i]);
}

for(var pet of pets){
  console.log(pet);
}

for(var pet in pets){
  console.log(pet);
}

var x = 0;

while(x < 10){
  console.log("X is less than ten");
  x++;
}
