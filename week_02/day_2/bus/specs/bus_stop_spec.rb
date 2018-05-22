require('minitest/autorun')
require('minitest/rg')
require_relative('../bus_stop')
require_relative('../person')

class Bus_StopTest < MiniTest::Test

  def setup
    @bus_stop = Bus_Stop.new("Central")
    @person1 = Person.new("Job", 35)
  end

  def test_bus_stop_has_name
    assert_equal("Central", @bus_stop.name)
  end

  def test_bus_stop_has_queue
    assert_equal([], @bus_stop.queue)
  end

  def test_bus_stop_queue_has_persons
    @bus_stop.add_to_queue(@person1)
    assert_equal(1, @bus_stop.queue.count())
  end

  def test_clear_bus_stop_queue
    @bus_stop.clear_queue()
    assert_equal(0, @bus_stop.queue.count())
  end


end
