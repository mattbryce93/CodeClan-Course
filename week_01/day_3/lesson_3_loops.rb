# a while loops executes code when a certain condiotion is true, after that condition changes the loop ends

counter = 0 # setting variables
my_number = 5

while (counter < my_number) # setting while condition
  p "Counter is #{counter}"
  counter += 1 # this increments counter, otherwise the loop would continue infinitely, crashing the application
end

while (true) #creates an infinite loop which needs something to stop it
  p "type something"
  input = gets.chomp()
  break if (input.downcase == 'q') # this line makes it possible for us to end this loop by typing the letter 'q'
  p "you typed #{input}"
end

numbers = [1,2,3,4,5]

for num in numbers # we can also loop through the array with this line. The format is For [value] in [array]. The only fixed parts are 'For' and 'in' but it helps when we type semantically as it makes our code more readable
  p num * 3 # as you can see, the 'num' is carried within the loop
end

total = 0

for num in numbers
  total = total + num # this incrementally adds everything from the number array giving us a total of 15
end

p total

chickens = ['Maigret', 'Hetty', 'Henrietta', 'Audrey', 'Mabel']

for chicken in chickens # in this line 'chicken' could be anything but it helps with semantics to keep stuff readable
  p chicken
end

chicken_hashes = [ # things get more complex as we use hashes
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

for chicken in chicken_hashes # but this looping through hashes can get very powerful very quickly
  p "#{chicken[:name]} is #{chicken[:age]}"
end

total_eggs = 0

for chicken in chicken_hashes # This gets so useful as it can constantly give an accurate total as the chicken_hashes hash is updated
  total_eggs += chicken[:eggs]
  chicken[:eggs] = 0 # this highlihghts that we can do multiple actions within a loop
end



p "There are #{total_eggs} eggs in total!"
p chicken_hashes

total_eggs = 0

for chicken in chicken_hashes
  if chicken[:eggs] > 0 # this shows that conditional logic can still be used within while loops, very useful!
    p "Wooo eggs!"
  end
end
