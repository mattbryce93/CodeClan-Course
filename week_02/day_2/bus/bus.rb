class Bus

  attr_reader :route, :destination
  
  def initialize(route, destination, passengers)
    @route = route
    @destination = destination
    @passengers = passengers
  end

  def drive
    return "Brum brum"
  end

  def count_passengers
    return @passengers.length()
  end

  def add_passenger(name)
    @passengers << name
  end

  def remove_passenger(name)
    for passenger in @passengers
      if passenger == name
        @passengers.delete(passenger)
      end
    end
  end

  def remove_all_passengers
    @passengers = []
  end

  def collect_all_passengers(stop)
    for people in stop.queue
      @passengers << people
    end
    stop.queue = []
  end

end
