fruits = ['apple', 'banana', 'grape', 'orange']

p fruits
# an array index starts at 0 so fruits[2] is 'grape'
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

fruits.unshift('apple') # puts 'apple' ontot the start of the Array
p fruits

fruits_numbers_arr = ['apple', 1, 'orange', 5] # Ruby allows arrays of diffirent data types in this case strings and integers
p fruits_numbers_arr

array_inception = [1, 2, 3, 4, [5, 6, 7]] # you can even have arrays within arrays!
p array_inception
