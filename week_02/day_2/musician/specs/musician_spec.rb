require('minitest/autorun')
require('minitest/rg')
require_relative('../musician')

class MusicianTest < MiniTest::Test

  def setup
    @musician1 = Musician.new("Jimi Hendrix", "Fender Strat", "guitar")
  end

  def test_musician_has_name
    assert_equal("Jimi Hendrix", @musician1.name)
  end

  def test_musician_can_play_song
    assert_equal("I'm playing Hey Joe", @musician1.play_song())
  end





end
