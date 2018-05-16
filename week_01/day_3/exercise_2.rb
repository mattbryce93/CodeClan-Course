# Make a hash containing the avengers Iron Man and Hulk.
# Each avenger has a name (Tony Stark and Bruce Banner) and a set of moves with an attack power.
# Iron man can punch (10) and kick (100) and Hulk can smash (1000) and roll (500).

Avengers = {
  Iron_man: { # having the colon before to create the symbol ie ':Iron_Man' was causing errors to be thrown about
    name: 'Tony Stark', # It can also be done like `:name: 'Tony Stark'` but I prefer the method shown
    moves: {
      punch: '10',
      kick: '100'
    }
  },
  Hulk: {
    name: 'Bruce Banner',
    moves: {
      smash: '1000',
      roll: '500'
    }
  }
}

p Avengers[:Iron_man][:name] # when I tried to print `Avengers[Iron_man:][name:]` (Note the colon position) I was receiving syntax errors also.
p Avengers[:Iron_man][:moves][:punch] # this is the correct method shown
p Avengers[:Iron_man][:moves][:kick]

p Avengers[:Hulk][:name]
p Avengers[:Hulk][:moves][:smash]
p Avengers[:Hulk][:moves][:roll]
