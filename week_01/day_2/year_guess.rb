p "Hey can you guess what year Ruby was created?"
guess = gets.chomp.to_i
if (guess < 1995)
  p "Sorry, it was later than that!"
elsif (guess > 1995)
  p "Sorry, it was earlier than that!"
else
  p "Hey that's right, Ruby was created in 1995!"
end
