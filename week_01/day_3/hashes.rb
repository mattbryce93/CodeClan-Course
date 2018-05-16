# A hash allows us to easily find values by accessing them through the use of keys. It makes us less dependent on index numbers
# Keys can only have one value. A value can have only one key.

my_first_hash = Hash.new() # These both create a new Hash
my_second_hash = {}

meals = {
  'breakfast' => 'yoghurt', # We can create an Hash as shown here. The comma is necessary except on the last line.
  'lunch' => 'greggs',
  'dinner' => 'steak'
}

p meals

p meals['breakfast'] # this accesses and prints 'yoghurt' as it accesses the value via the key
p meals['supper'] # returns nil as there is no key called 'supper'

# when creating a hash we can give a default value for non declared keys that are accessed

meals = Hash.new('nowt')
p meals["supper"] # supper was never assigned so its value here is 'nowt'

meals['supper'] = 'pancakes' # this assigns the 'supper' key value to 'pancakes'
p meals

meals['dinner'] = 'chicken' # this replaces 'steak' value with 'chicken'
p meals

meals.delete('breakfast') # this will delete the key-value pair and must be done via the key, using a value string would bring an error
p meals
