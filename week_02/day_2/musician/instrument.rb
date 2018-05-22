class Instrument

  attr_reader :name, :type

  def initialize(name, type)
    @name = name
    @type = type
  end

  def make_sound(song)
    if @type == "piano"
      return "Plink plonk... I'm playing #{song}!"
    else
      return "I'm playing #{song}!"
    end
  end

end
