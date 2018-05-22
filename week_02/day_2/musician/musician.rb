class Musician

  attr_reader :name

  def initialize(name, instrument)
    @name = name
    @instrument = instrument
  end

  def play_song(song)
    @instrument.make_sound(song)
  end


end
