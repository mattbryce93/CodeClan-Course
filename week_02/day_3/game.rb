class Game

  attr_reader :guessed_letters, :player, :word

  def initialize(player, word)
    @player = Player.new(player)
    @word = HiddenWord.new(word)
    @guessed_letters = []
  end

  def guess_letter(guess)
    current_display = @word.display
    @guessed_letters.push(guess)
    if @word.letter_in_word(guess) == true
      @word.place_letter_into_display(guess)
    else
      @player.life_lost
    end
  end

  def has_ended?
    return true if @player.lives == 0 || @word.display == @word
    return false
  end


end
