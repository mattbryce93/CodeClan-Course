# def fizz_buzz(number)
#   if number.is_a? Integer
#     if number <= 1
#       return "Error!"
#     else
#       if number % 3 == 0 && number % 5 == 0
#         return "Fizzbuzz"
#       elsif number % 5 == 0
#         return "Buzz"
#       elsif number % 3 == 0
#         return "Fizz"
#       else
#         return number.to_s()
#       end
#     end
#   else
#     return "That's not a number!"
#   end
# end

numbers = [3, 5]
words = ['fizz', 'buzz']

# def factor(number, divisor)
#   if number % divisor == 0
#     return true
#   else
#     return false
#   end
# end

def fizz_buzz(number_array, word_array)
  i = 0
  counter = 1
  string = ""
  while counter <= 100
    if counter % number_array[i] == 0
      string << word_array[i].to_s
    else
      string << counter.to_s
    end
    p string
    counter += 1

  end
end

fizz_buzz(numbers, words)
