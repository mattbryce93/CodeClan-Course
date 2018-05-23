require_relative('./game')
require_relative('./player')
require_relative('./hidden_word')

p "Enter the secret word!"
secret_word = gets.chomp()
system "clear"
p "What is your name?"
player_name = gets.chomp()
system "clear"
new_game = Game.new(player_name, secret_word)
#start of loop
#check game condition
p "Ok, #{new_game.player.name} you have #{new_game.player.lives} lives remaining"
p "Can you guess this word? #{new_game.word.display}"

while !new_game.has_ended?
  guess = gets.chomp()
  new_game.guess_letter(guess)
  p "#{new_game.word.display}"
end

p "You Lose!!"
