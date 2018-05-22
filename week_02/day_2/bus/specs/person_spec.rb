require('minitest/autorun')
require('minitest/rg')
require_relative('../person')

class PersonTest < MiniTest::Test

  def setup
    @person = Person.new("Matt", 24)
  end

  def test_person_has_name
    assert_equal("Matt", @person.name)
  end

  def test_person_has_age
    assert_equal(24, @person.age)
  end

end
