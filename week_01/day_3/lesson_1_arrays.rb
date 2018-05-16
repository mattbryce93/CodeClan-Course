 fruits = ['apple', 'banana', 'grape', 'orange'] # an array index starts at 0 so fruits[2] is 'grape'

p fruits
p fruits[0] #'apple'
p fruits[2] #'grape'
p fruits[4] #nil

p fruits[-1] #'orange'
p fruits[-2] #'grape'

p fruits.first() #'apple'
p fruits.first(2) #'apple', 'banana'

p fruits.last() #'orange'
p fruits.last(2) #'grape', 'orange'

my_array =[] #both of these create a new array
my_array = Array.new()

p fruits

fruits[1] = 'mango' #reassigns second element from 'banana' to 'mango'
p fruits

fruits[10] = 'pineapple' # assigns pineapple to the 10th index and makes all in between 'orange' and 'pineapple'
p fruits

fruits.push('pear') # adds 'pear' to the end of the array
p fruits

fruits.pop() # removes the last element from the array fruits(2) will take off the last two elements
p fruits

fruits << 'lemon' # adds 'lemon' to the end of the array
p fruits

fruits.shift() # takes the first element off of the array, 'apple' in this case
p fruits

fruits.unshift('apple') # puts 'apple' onto the start of the Array
p fruits

p fruits.index('grape') # prints the index posistion of the 'grape' value. In this case 2.

p fruits.delete('orange') # deletes any value matching 'orange'

p fruits.delete_at(2) # deletes the value in index 2

p fruits.length # prints the number of values in the array

fruits_numbers_arr = ['apple', 1, 'orange', 5] # Ruby allows arrays of diffirent data types in this case strings and integers
p fruits_numbers_arr

array_inception = [1, 2, 3, 4, [5, 6, 7]] # you can even have arrays within arrays!
p array_inception



p fruits

fruits.sort() # this will sort the array but it won't commit the changes permenantly
p fruits

fruits.sort!() # the exclamation mark in the sort function commits the changes to the fruits array
p fruits

# for more details about arrays have a look here https://ruby-doc.org/core-2.4.1/Array.html
