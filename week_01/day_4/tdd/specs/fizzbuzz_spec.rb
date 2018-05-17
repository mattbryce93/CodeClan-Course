require('minitest/autorun') # requires these packages
require('minitest/rg')

require_relative('../fizzbuzz.rb') # and this file

class Fizzbuzz < MiniTest::Test # How to set up tests

  def test_fizz_buzz_3_returns_fizz
    assert_equal("Fizz", fizz_buzz(3))
  end

  def test_fizz_buzz_5_returns_buzz
    assert_equal("Buzz", fizz_buzz(5))
  end

  def test_fizz_buzz_6_returns_fizz
    assert_equal("Fizz", fizz_buzz(6))
  end

  def test_fizz_buzz_15_returns_fizzbuzz
    assert_equal("Fizzbuzz", fizz_buzz(15))
  end

  def test_return_number_as_string
    assert_equal('2', fizz_buzz(2))
  end

  def test_invalid_input
    assert_equal("That's not a number!", fizz_buzz("three"))
  end

end
