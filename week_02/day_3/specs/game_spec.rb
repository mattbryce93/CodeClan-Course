require('minitest/autorun')
require('minitest/rg')

require_relative('../game')
require_relative('../player')
require_relative('../hidden_word')

class GameTest < MiniTest::Test

  def setup
    @player1 = Player.new("Pete")
    @hidden_word1 = HiddenWord.new("france")
    @game1 = Game.new(@player1, @hidden_word1)
  end

  def test_game_has_player
    assert_equal(@player1, @game1.player)
  end

  def test_game_has_word
    assert_equal(@hidden_word1, @game1.word)
  end

  def test_guess_appears_in_guessed_letters
    @game1.guess_letter("f")
    @game1.guess_letter("x")
    assert_equal(@game1.guessed_letters.length, 2)
  end

  def test_display_showing_guessed_letters
    @game1.guess_letter("f")
    @game1.guess_letter("c")
    assert_equal(@game1.word.display, "f***c*")
  end

  def test_player_guess_loses_life
    assert_equal(@player1.lives, 6)
    @game1.guess_letter("d")
    assert_equal(@player1.lives, 5)
  end

  def test_player_can_win
    @game1.guess_letter("f")
    @game1.guess_letter("r")
    @game1.guess_letter("a")
    @game1.guess_letter("n")
    @game1.guess_letter("c")
    @game1.guess_letter("e")
    assert_equal("You win!", @game1.check_game_condition)
  end











end
