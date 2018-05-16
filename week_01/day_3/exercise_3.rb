# create an app that gets the user to guess a number until it is correct
my_number = 5
p "What number am I thinking of?"
value = gets.chomp.to_i() # .to_i is necessary otherwise any number entered would be treated as a string

while(value != my_number) # determines if the user is correct immediately
  if value < my_number # introduces an if statement to give the user a clue based on their guess
    p "Nope, it's higher!"
  else
    p "Nope, its lower!"
  end
  p "Try again!" # if they are within this loop we can get them to try again after receiving their clue
  value = gets.chomp.to_i() # Users new guess goes here and while loop repeats
end
p "You got it!" # only happens when value = 5
