require('minitest/autorun')
require('minitest/rg')

require_relative('../player')

class PlayerTest < MiniTest::Test

  def setup()
    @player1 = Player.new("Player_One")
  end

  def test_player_has_name
    assert_equal("Player_One", @player1.name())
  end

  def test_player_has_lives
    assert_equal(6, @player1.lives())
  end

  def test_player_loses_life
    @player1.life_lost()
    assert_equal(5, @player1.lives())
  end
  
end
