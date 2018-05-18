require( 'minitest/autorun' )
require( 'minitest/rg' )
require_relative( '../pig_latin' )

class TestFriends < MiniTest::Test

  def test_pigLatin
    result = pigLatin("This is a test of PigLatin")
    assert_equal(result, "Histay siay aay esttay foay iglatinpay")
  end

end
