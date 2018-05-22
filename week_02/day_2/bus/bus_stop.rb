class Bus_Stop

  attr_reader :name
  attr_accessor :queue

  def initialize(name)
    @name = name
    @queue = []
  end

  def add_to_queue(name)
    @queue << name
  end

  def clear_queue
    @queue.clear()
  end

















end
