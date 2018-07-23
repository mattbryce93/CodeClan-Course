var guitars = ["fender", "gibson", "gretsch", "yamaha"];

guitars.push("yamaha");

guitars[0] = "yamaha";

guitars.splice(0, 2, "epiphone");

guitars.shift();
guitars.unshift("tanglewood");

guitars.filter(guitar => guitar > 6);

console.log(guitars);
