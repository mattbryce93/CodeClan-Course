require('minitest/autorun')
require('minitest/rg')
require_relative('../bus_stop')

class Bus_StopTest < MiniTest::Test

  def setup
    @bus_stop = Bus_Stop.new("Central")
  end

  def test_bus_stop_has_name
    assert_equal("Central", @bus_stop.name)
  end

  def test_bus_stop_has_queue
    assert_equal([], @bus_stop.queue)
  end

  def test_bus_stop_queue_has_persons
    @bus_stop.add_to_queue("Job")
    assert_equal(["Job"], @bus_stop.queue)
  end








end
