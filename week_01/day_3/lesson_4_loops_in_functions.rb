# Using loops in functions creat reusable snippets of code that can be used again and again

chicken_hashes = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

def count_eggs(array) # still specific as a functions but can be used on any array we are provided
  total_eggs = 0

  for chicken in array # we use 'array' as that is what is passed into the function
    total_eggs += chicken[:eggs]
    chicken[:eggs] = 0
  end

  return total_eggs.to_s() + " eggs collected" # the to.s in this line makes concatenation easier

end

p count_eggs(chicken_hashes) # this is required to actually call the function, this means that our counting function is not dependent on the array



def find_chicken_by_name(name, array) # adding the array variable allows is to pass in any array we have
  for chicken in array
    if chicken[:name] == name # conditionally searches for the name that is provided
      return chicken # using return is better than print as we want to be able to pass values to more code
    end
  end
end

p find_chicken_by_name("Audrey", chicken_hashes) # the order of the variables is important as it needs to match the def variable order

p find_chicken_by_name("Brian", chicken_hashes) # there is no Brian value and so Ruby returns the entire hash

def find_chicken_by_name(name, array)
  for chicken in array
    if chicken[:name] == name
      return chicken
    # else
    #   return "Not found" # this line would break the function as it would cause the function to exit here and not loop through the entire array, it would exit after the first array query
    end
  end

  return "Not found" # this fixes the function returning the entire hash
end

p find_chicken_by_name("Brian", chicken_hashes) # now we get "Not found" instead
