var myName = "John";

if(myName == "Steve" && 1 === 1){
  console.log("Ohai!");
}


var counter = 1;

if(counter > 0){
  console.log("The counter is greater thatn zero");
} else if (counter < 0){
  console.log("Tho counter is less than zero");
} else {
  console.log("The counter is zero");
}

var pet = "cat";

switch(pet) {
  case "cat":
    console.log("Miaoow");
    break;
  case "dog":
    console.log("Woooof");
    break;
  default:
    console.log("You have no pet");
}
