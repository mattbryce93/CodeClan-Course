# Make a hash with a key of a persons name and the value as their pocket money.
# Try updating and deleting items from it.

name_money_hash = Hash.new(0) # default value is 0
name_money_hash['Steven'] = 100 # adding key-value pairs
name_money_hash['Matt'] = 25
name_money_hash['Rachel'] = 50

pocket_money = { # Different method for creating hash, no default value
  "Matt" => "£2",
  "Steven" => "£5",
  "Rachel" => "£10"
}

p name_money_hash # checking hash

p pocket_money # checking second hash

p name_money_hash['Bob'] # will return 0
p pocket_money['Bob'] # will return nil
