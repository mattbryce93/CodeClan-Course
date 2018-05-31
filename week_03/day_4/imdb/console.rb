require_relative( 'models/casting' )
require_relative( 'models/movie' )
require_relative( 'models/star' )

require( 'pry-byebug' )

Movie.delete_all()
Star.delete_all()
Casting.delete_all()

movie1 = Movie.new({
  'title' => 'Fellowship of the Ring',
  'genre' => 'Fantasy',
  'rating' => 'Critically Acclaimed'
  })
movie1.save()

movie2 = Movie.new({
  'title' => 'Two Towers',
  'genre' => 'Fantasy',
  'rating' => 'Oscar Awarded'
  })
movie2.save()

star1 = Star.new({
  'first_name' => 'Elijah',
  'last_name' => 'Wood'
  })
star1.save()

star2 = Star.new({
  'first_name' => 'Viggo',
  'last_name' => 'Mortensen'
  })
star2.save()

casting1 = Casting.new({
  'movie_id' => movie1.id,
  'star_id' => star1.id,
  'fee' => '100_000'
  })
casting1.save()

casting2 = Casting.new({
  'movie_id' => movie2.id,
  'star_id' => star2.id,
  'fee' => '500_000_000'
  })
casting2.save()




binding.pry
nil
