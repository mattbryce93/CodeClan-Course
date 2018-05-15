def greet(name)
  return "Hey" + name
end
          # Name cannot begin with a number or an uppercase letter.
          # Special characters are allowed and imply functionality.
          # ?greet() implies it returns a boolean for example!
          # Code outside the function cannot access variables within
          # It compartmentalizes the Code

p greet("Bob")

def myFunction(parameter)
  return parameter
end

p myFunction('argument')

p myFunction(12345)

# def new_greet(name, time_of_day)
#   return "Good " + time_of_day + ", " + name # this is concantenation
# end

# p new_greet('Bob', 'morning')


# def newer_greet(name, time_of_day)
#   return "Good #{time_of_day}, #{name}" # this is interpolation
# end

# p newer_greet('Bob', 'morning')

def greet_upcase(name, time_of_day)
  return "Good #{time_of_day}, #{name.capitalize}!"
end

p greet_upcase('bob', 'morning')
