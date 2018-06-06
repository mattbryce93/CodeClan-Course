require('minitest/autorun')
require('minitest/rg')
require('pry-byebug')
require_relative('../models/house')

class HouseTest < MiniTest::Test

  def setup
    House.delete_all()
    @house1 = House.new({
      'name' => 'Gryffindor',
      'logo' => 'https://vignette.wikia.nocookie.net/harrypotterfanon/images/f/f0/Gryffindor_Crest_Transparent.png/revision/latest?cb=20170418124111&format=original'
      })
    @house1.save()

    @house2 = House.new({
      'name' => 'Hufflepuff',
      'logo' => 'https://vignette.wikia.nocookie.net/harrypotter/images/5/50/0.51_Hufflepuff_Crest_Transparent.png/revision/latest?cb=20161020182518&format=original'
      })
    @house2.save()

    @house3 = House.new({
      'name' => 'Ravenclaw',
      'logo' => 'https://vignette.wikia.nocookie.net/pottermore/images/4/40/Ravenclaw_Crest_1.png/revision/latest?cb=20140604194505&format=original'
      })
    @house3.save()

    @house4 = House.new({
      'name' => 'Slytherin',
      'logo' => 'https://vignette.wikia.nocookie.net/harrypotter/images/d/d3/0.61_Slytherin_Crest_Transparent.png/revision/latest?cb=20161020182557&format=original'
      })
    @house4.save()

  end

  def test_house_has_name()
    assert_equal('Gryffindor', @house1.name())
  end

  def test_house_save_commits_to_db()
    sql = "SELECT * FROM houses WHERE id = $1"
    values = [@house1.id()]
    results = SqlRunner.run(sql, values)
    assert_equal(results.first()['name'], 'Gryffindor')
  end

  def test_house_find_all_method()
    results = House.find_all()
    assert_equal(4, results.length())
  end

  def test_house_find_by_id()
    result = House.find_by_id(@house1.id)
    assert_equal(result.name, "Gryffindor")
  end
  
end
