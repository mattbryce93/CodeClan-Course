# Exercise A
# Given the following data structure:

stops = [ "Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket" ]

# Complete these tasks:
# Add "Edinburgh Waverley" to the end of the array

stops.push("Edinburgh Waverley")
p stops

# Add "Glasgow Queen St" to the start of the array

stops.unshift("Glasgow Queen St")
p stops

# Add "Polmont" at the appropriate point (between "Falkirk High" and "Linlithgow")

stops.insert(4, "Polmont")
p stops

# Work out the index position of "Linlithgow"

p stops.index("Linlithgow")

# Remove "Livingston" from the array using its name

stops.delete("Livingston")
p stops

# Delete "Cumbernauld" from the array by index

stops.delete_at(2)
p stops

# How many stops there are in the array?

p stops.length()
p stops.count()
p stops.size()

# How many ways can we return "Falkirk High" from the array?

p stops[2]
for stop in stops
  if stop == "Falkirk High"
    p "This is #{stop}."
  else
    p "This is not Falkirk High this is #{stop}."
  end
end
p stops[-5]
p stops[2..2]
p stops.slice(2) # stops.slice!(2) would alter the original array permenantly
p stops.fetch(2)
p stops.at(2)

# Reverse the positions of the stops in the array

p stops.reverse() # stops.reverse!() would alter the original array permenantly

# Print out all the stops using a for loop

for stop in stops
  p stop
end

# Exercise B
# Given the following data structure:
users = {
  "Jonathan" => {
    :twitter => "jonnyt",
    :lottery_numbers => [6, 12, 49, 33, 45, 20],
    :home_town => "Stirling",
    :pets => [
    {
      :name => "fluffy",
      :species => "cat"
    },
    {
      :name => "fido",
      :species => "dog"
    },
    {
      :name => "spike",
      :species => "dog"
    }
  ]
  },
  "Erik" => {
    :twitter => "eriksf",
    :lottery_numbers => [18, 34, 8, 11, 24],
    :home_town => "Linlithgow",
    :pets => [
    {
      :name => "nemo",
      :species => "fish"
    },
    {
      :name => "kevin",
      :species => "fish"
    },
    {
      :name => "spike",
      :species => "dog"
    },
    {
      :name => "rupert",
      :species => "parrot"
    }
  ]
  },
  "Avril" => {
    :twitter => "bridgpally",
    :lottery_numbers => [12, 14, 33, 38, 9, 25],
    :home_town => "Dunbar",
    :pets => [
      {
        :name => "monty",
        :species => "snake"
      }
    ]
  }
}
# Complete these tasks:
# Get Jonathan's Twitter handle (i.e. the string "jonnyt")

p users["Jonathan"][:twitter]

# Get Erik's hometown

p users["Erik"][:home_town]

# Get the array of Erik's lottery numbers

p users["Erik"][:lottery_numbers]

# Get the type of Avril's pet Monty

p users["Avril"][:pets][0][:species]

# Get the smallest of Erik's lottery numbers

p users["Erik"][:lottery_numbers].min()

# Return an array of Avril's lottery numbers that are even

even_lottery_numbers = []
for num in users["Avril"][:lottery_numbers]
  if num % 2 == 0
    even_lottery_numbers.push(num)
  end
end
p even_lottery_numbers

# Erik is one lottery number short! Add the number 7 to be included in his lottery numbers

p users["Erik"][:lottery_numbers].push(7)

# Change Erik's hometown to Edinburgh

p users["Erik"][:home_town] = 'Edinburgh'

# Add a pet dog to Erik called "Fluffy"

users["Erik"][:pets].push({
  :name => 'Fluffy',
  :species => 'dog'
})

p users["Erik"][:pets][4]

# Add another person to the users hash

users.merge!("Rachel" => {
  :twitter => "rayray",
  :lottery_numbers => [1, 4, 33, 3, 9, 65],
  :home_town => "Troon",
  :pets => [
    {
      :name => "Bark",
      :species => "cat"
    }
  ]
})
p users

# Exercise C
# Given the following data structure:
united_kingdom = [
  {
    name: "Scotland",
    population: 5_295_000,
    capital: "Edinburgh"
  },
  {
    name: "Wales",
    population: 3_063_000,
    capital: "Swansea"
  },
  {
    name: "England",
    population: 53_010_000,
    capital: "London"
  }
]

# Complete these tasks:
# Change the capital of Wales from "Swansea" to "Cardiff".

p united_kingdom[1][:capital] = "Cardiff"

# Create a Hash for Northern Ireland and add it to the united_kingdom array (The capital is Belfast, and the population is 1,811,000).

united_kingdom.push({
  :name => 'Northern Ireland',
  :population => 1_811_000,
  :capital => 'Belfast'
  })

# this could also have been done like this (I prefer this style I think)

# united_kingdom.push({
#   name: 'Northern Ireland',
#   population: 1_811_000,
#   capital: 'Belfast'
#   })

p united_kingdom

# Use a loop to print the names of all the countries in the UK.

for country in united_kingdom
  p "#{country[:name]} "
end

# Use a loop to find the total population of the UK.

total_population = 0

for country in united_kingdom
  total_population = total_population + country[:population]
end

print total_population
