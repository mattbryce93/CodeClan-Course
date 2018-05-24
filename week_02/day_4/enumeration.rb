chickens = ["Maigret", "John", "Louise", "James"]
num_array = [1,2,3,4]

# for chicken in chickens
#   p chicken
# end


# chickens.each { |chicken| p chicken }


# chickens.each do |chicken|
#   shouting_chicken = chicken.upcase()
#   p shouting_chicken
# end


# name_lengths = []
# chickens.each {|chicken| name_lengths << chicken.length()}
# p name_lengths


# name_lengths = chickens.map { |chicken| chicken.length() }
# p name_lengths


# chickens.each_with_index { |chicken, index| p "#{chicken} is at index #{index}"}

# p chickens.find{ |chicken| chicken[0] == "J"}

# p chickens.find_all { |chicken| chicken[0] == "J" }

# p chickens.reduce { |list, chicken| list + ", " + chicken }
# p num_array.reduce { |total, number| total + number }
