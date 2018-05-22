require('minitest/autorun')
require('minitest/rg')
require_relative('../bus')
require_relative('../bus_stop')
require_relative('../person')

class BusTest < MiniTest::Test

  def setup
    @bus = Bus.new(22, "Ocean Terminal", [])
  end

  def test_has_route
    assert_equal(22, @bus.route)
  end

  def test_has_destination
    assert_equal("Ocean Terminal", @bus.destination)
  end

  def test_bus_can_drive
    assert_equal("Brum brum", @bus.drive)
  end

  def test_count_passengers
    assert_equal(0, @bus.count_passengers)
  end

  def test_add_passenger
    @bus.add_passenger("Jackie")
    assert_equal(1, @bus.count_passengers)
  end

  def test_remove_passenger
    @bus.add_passenger("Steve")
    assert_equal(1, @bus.count_passengers)
    @bus.remove_passenger("Steve")
    assert_equal(0, @bus.count_passengers)
  end

  def test_empty_bus
    @bus.add_passenger("Jimmy")
    @bus.add_passenger("Meg")
    assert_equal(2, @bus.count_passengers)
    @bus.remove_all_passengers
    assert_equal(0, @bus.count_passengers)
  end

  def test_collect_all_passengers
    stop = Bus_Stop.new("King Street")
    person1 = Person.new("Jacob", 37)
    person2 = Person.new("Grant", 70)
    stop.add_to_queue(person1)
    stop.add_to_queue(person2)
    assert_equal(2, stop.queue.length)
    assert_equal(0, @bus.count_passengers)
    @bus.collect_all_passengers(stop)
    assert_equal(0, stop.queue.length)
    assert_equal(2, @bus.count_passengers)

  end

end
