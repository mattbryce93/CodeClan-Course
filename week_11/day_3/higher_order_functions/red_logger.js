const logRed = function(message){
  console.log(message);
};

const logNotRed = function(){
  console.log("It's not red!");
};

const redChecker = function(colour, isRed, isNotRed){
  if (colour === "red"){
    isRed(`It's ${colour}, baby!`);
  } else {
    isNotRed();
  }
};

redChecker("red", logRed, logNotRed);
redChecker("blue", logRed, logNotRed);
