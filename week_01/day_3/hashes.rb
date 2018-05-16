# # A hash allows us to easily find values by accessing them through the use of keys. It makes us less dependent on index numbers
# # Keys can only have one value. A value can have only one key.
#
# my_first_hash = Hash.new() # These both create a new Hash
# my_second_hash = {}
#
# meals = {
#   'breakfast' => 'yoghurt', # We can create an Hash as shown here. The comma is necessary except on the last line.
#   'lunch' => 'greggs',
#   'dinner' => 'steak'
# }
#
# p meals
#
# p meals['breakfast'] # this accesses and prints 'yoghurt' as it accesses the value via the key
# p meals['supper'] # returns nil as there is no key called 'supper'
#
# # when creating a hash we can give a default value for non declared keys that are accessed
#
# meals = Hash.new('nowt') # to do this use cannot use `hash_name = {}` it must be with `hash_name = Hash.new('default')`
# p meals["supper"] # supper was never assigned so its value here is 'nowt'
#
# meals['supper'] = 'pancakes' # this assigns the 'supper' key value to 'pancakes'
# p meals
#
# meals['dinner'] = 'chicken' # this replaces 'steak' value with 'chicken'
# p meals
#
# meals.delete('breakfast') # this will delete the key-value pair and must be done via the key, using a value string would bring an error
# p meals
#
# p meals.keys # will return all the keys of a Hash
# p meals.values # will return all the values in a Hash
#

# p :my_sym # the colon here creates a symbol
# p :hello
#
# p :my_sym + :hello # a string would concantenate,  symbols cannot be added like this

# meals = { # this hash uses symbols as the keys, this is a much faster way of accessing hashes and can be used to optimise systems significantly
#   :breakfast => 'yoghurt',
#   :lunch => 'Greggs'
# }
#
# p meals[:breakfast]

# countries = { # symbols can also be created by putting the colon after as opposed to before the symbol
#   uk: "London",
#   germany: "Berlin"
# }
#
# p countries

# We can store hashes within hashes, it sounds scary but can be incredibly useful

countries = {
  uk: {
    capital: "London",
    population: "10000"
  },
  germany: {
    capital: "Berlin",
    population: "40000"
  }
}

p countries[:germany][:population] # this is how we access the nested hash values, in my test the colon must be before 'germany' and 'population'
