require('minitest/autorun')
require('minitest/rg')

require_relative('../hidden_word')
require_relative('../player')

class HiddenWordTest < MiniTest::Test

  def setup
    @hidden_word1 = HiddenWord.new("canada")
  end

  def test_hidden_word_has_string
    assert_equal("canada", @hidden_word1.display_word)
  end

  def test_can_return_length_of_string
    assert_equal(6, @hidden_word1.word_length)
  end

  def test_can_show_display
    assert_equal("******", @hidden_word1.display_push)
  end

  def test_place_letter_into_display
    @hidden_word1.place_letter_into_display("c")
    @hidden_word1.place_letter_into_display("a")
    assert_equal("ca*a*a", @hidden_word1.display)
  end

  def test_can_search_word_for_letter__found
    assert_equal(true, @hidden_word1.letter_in_word("d"))
  end

  def test_can_search_word_for_letter__not_found
    assert_equal(false, @hidden_word1.letter_in_word("z"))
  end

end
