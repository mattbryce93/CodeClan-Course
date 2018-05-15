#p "What score did you get in your exam?"

#score = gets.chomp.to_i

#result = case score
#when 10
#  "Genius!"
#when 8..9
#  "Merit"
#when 5..7
#  "Pass"
#when 4
#  "Resit"
#else
#  "Fail"
#end

#p result

#

#score = 6
#result = "Fail"
#result = "Pass" if (score >= 6)
#p result

#Ternary Method

# score = 6
# result = score >= 6 ? "Pass" : "Fail"
# p result
