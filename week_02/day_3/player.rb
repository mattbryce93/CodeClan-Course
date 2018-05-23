class Player

  attr_reader :name, :lives

  def initialize(name)
    @name = name
    @lives = 6
  end

  def life_lost()
    @lives -= 1
  end

end
