# a while loops executes code when a certain condiotion is true, after that condition changes the loop ends

counter = 0 # setting variables
my_number = 5

while (counter < my_number) # setting while condition
  p "Counter is #{counter}"
  counter += 1 # this increments counter, otherwise the loop would continue infinitely, crashing the application
end
