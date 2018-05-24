class HiddenWord

  attr_reader :display, :word

  def initialize(word)
    @word = word
    number = @word.length
    @display = ""
    number.times {@display << "*"}
  end

  def display_word
    return @word
  end

  def word_length
    return @word.length()
  end

  def display_push
    number = @word.length
    display = ""
    number.times {display << "*"}
    return display
  end

  def letter_in_word(input_letter)
    letters_array = @word.split(//)
    if letters_array.include?(input_letter)
      return true
    else
      return false
    end
  end


  def place_letter_into_display(input_letter)
    positions = []
    letters_array = @word.split(//)
    i = 0
    for letter in letters_array
      if input_letter == letter
        positions.push(i)
      end
      i += 1
    end
    for position in positions
      @display[position] = input_letter
    end
    @display
  end

  #   return positions #Brings back an array which includes the index position of the input_letter, which will later be used to position the letter within @word.





end
