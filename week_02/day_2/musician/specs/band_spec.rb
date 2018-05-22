require('minitest/autorun')
require('minitest/rg')
require_relative('../musician')
require_relative('../instrument')
require_relative('../band')

# ```Create a new class Band
# Band should have a name and an array of Musicians in its constructor
# Band should have a perform(song_title) method that creates a new array, calls the play_song(title) on every musician in its musicians array, then passes the strings the method returns into the new array. (Hint: Use a loop)```

class BandTest < MiniTest::Test

  def setup
    piano = Instrument.new("Yamaha", "piano")
    guitar = Instrument.new("Tanglewood", "guitar")
    drums = Instrument.new("Hi Tops", "drums")
    bass = Instrument.new("Bridge Cable", "bass")

    musician1 = Musician.new("Freddy Mercury", piano)
    musician2 = Musician.new("Brian May", guitar)
    musician3 = Musician.new("Roger Taylor", drums)
    musician4 = Musician.new("John Deacon", bass)

    musicians = [musician1, musician2, musician3, musician4]

    @band = Band.new("Queen", musicians)
  end

  def test_band_has_name
    assert_equal("Queen", @band.name)
  end

  def test_band_has_members
    assert_equal(4, @band.members.count)
  end

  def test_band_can_play_song
    expected = ["Plink plonk... I'm playing We Will Rock You!", "Twang... I'm playing We Will Rock You!", "Bang bang... I'm playing We Will Rock You!", "Boing... I'm playing We Will Rock You!"]
    assert_equal(expected, @band.perform("We Will Rock You"))
  end







end
