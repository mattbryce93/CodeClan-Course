require("minitest/autorun")
require("minitest/rg")

class TestExample < MiniTest::Test

  def setup()
    @person1 = {"name" => "Alex", "age" => 3}
  end

  def test_can_change_name
    @person1["name"] = "Alexander"
    assert_equal("Alexander", @person1["name"])
  end

  def test_person_has_name
    assert_equal("Alex", @person1["name"])
  end
end
