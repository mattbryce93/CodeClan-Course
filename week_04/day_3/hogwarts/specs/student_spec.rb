require('minitest/autorun')
require('minitest/rg')
require('pry-byebug')
require_relative('../models/student')
require_relative('../models/house')

class StudentTest < MiniTest::Test

  def setup()
    Student.delete_all()
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

            @student1 = Student.new({
              'first_name' => 'Matthew',
              'last_name' => 'Bryce',
              'house_id' => @house1.id,
              'age' => '24'
              })
              @student1.save()

              @student2 = Student.new({
                'first_name' => 'Steve',
                'last_name' => 'Bonner',
                'house_id' => @house2.id,
                'age' => '27'
                })
                @student2.save()

                @student3 = Student.new({
                  'first_name' => 'Angelina',
                  'last_name' => 'Blyth',
                  'house_id' => @house3.id,
                  'age' => '20'
                  })
                  @student3.save()

                  @student4 = Student.new({
                    'first_name' => 'Jack',
                    'last_name' => 'McGee',
                    'house_id' => @house4.id,
                    'age' => '22'
                    })
                    @student4.save()
                  end

                  def test_student_has_name()
                    assert_equal('Matthew', @student1.first_name)
                  end

                  def test_student_save_commits_to_db()
                    sql = "SELECT * FROM students WHERE id = $1"
                    values = [@student1.id()]
                    results = SqlRunner.run(sql, values)
                    assert_equal(results.first()['first_name'], 'Matthew')
                  end

                  def test_student_find_all_method()
                    results = Student.find_all()
                    assert_equal(4, results.length())
                  end

                  def test_find_student_by_id()
                    results = Student.find_by_id(@student1.id())
                    assert_equal(results.first_name, "Matthew" )
                  end

                  def test_find_students_house()
                    result = @student1.find_house()
                    assert_equal(result.name, "Gryffindor")
                  end

                end
