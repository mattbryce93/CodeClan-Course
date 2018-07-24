var name = "Matthew";

var secretsFunction = function(){
  var pinCode = [0,0,0,0];
  console.log('pinCode inside secrets function:', pinCode);
  console.log(name);
}

secretsFunction();

console.log('pinCode inside secrets function:', pinCode);

var filterNamesByFirstLetter = function(names, letter){
  var filteredNames = [];
  for (let name of names){
    if (name[0] === letter){
      filteredNames.push(name);
    }
  }
  return filteredNames;
}

var names = ['Matt', 'Mike', 'Cleyra', 'Claire', 'Scott', 'Steve'];

console.log(filterNamesByFirstLetter(names, 'M'));
console.log(filterNamesByFirstLetter(names, 'C'));
console.log(filterNamesByFirstLetter(names, 'S'));

let temperature = 30;

if (temperature > 15) {  //pass
  let jacket = false; //local
  var happy = true; //global
}
else {
  let jacket = true;
  var happy = false;
}

console.log('jacket after if-else blocks:', jacket); //error
console.log('happy after if-else blocks:', happy); //true if function can see temperature

const calculateEnergy = function(mass){
  const speedOfLight = 299792458;
  return mass * speedOfLight ** 2;
}

let energyOfMe = calculateEnergy(50);

console.log('energyOfMe:', energyOfMe);

const song = {
  title: 'Caledonia',
  artist: 'Frankie Miller'
}

console.log('song before mutation', song);

song.artist = 'Dougie Maclean';

console.log('song after mutation', song);

const songs = [song, 'Happy Birthday', 'Hey Jude']

console.log('songs before mutation:', songs);

songs[1] = 'Call me Maybe!';

songs.pop();

console.log('songs after mutation:', songs);
