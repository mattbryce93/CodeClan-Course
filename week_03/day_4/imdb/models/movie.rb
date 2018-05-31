require_relative('../db/sql_runner')
require_relative('./casting')
require( 'pry-byebug' )

class Movie

  attr_accessor :id, :title, :genre, :rating

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @title = options['title']
    @genre = options['genre']
    @rating = options['rating']
    @budget = options['budget'].to_i
  end

  def save()
    sql = "INSERT INTO movies (title, genre, rating) VALUES ($1, $2, $3) returning id"
    values = [@title, @genre, @rating]
    results = SqlRunner.run(sql, values).first
    @id = results['id'].to_i
  end

  def update()
    sql = "UPDATE movies SET (title, genre, rating) = ($1, $2, $3) WHERE id = $4"
    values = [@title, @genre, @rating, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM movies WHERE id = $1"
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def stars()
    sql = "SELECT * FROM stars INNER JOIN castings ON castings.star_id = stars.id INNER JOIN movies ON castings.movie_id = movies.id WHERE movies.id = $1"
    values = [@id]
    results = SqlRunner.run(sql, values)
    return results.map {|result| Star.new(result)}
  end

  def remaining_budget()
    castings = self.castings()
    return castings
    casting_fees = castings.map{|casting| casting.fee}
    combined_fees = casting_fees.sum
    return @budget - combined_fees
  end

  def castings()
    sql = "SELECT * FROM castings WHERE movie_id = $1"
    values = [@id]
    results = SqlRunner.run(sql, values)
    return results.map {|result| Casting.new(result)}
  end

  def self.find(id)
    sql = "SELECT * FROM movies WHERE id = $1"
    values = [id]
    results = SqlRunner.run(sql, values).first
    return Movie.new(results)
  end

  def self.delete_all()
    sql = "DELETE FROM movies"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM movies"
    results = SqlRunner.run(sql)
    return results.map{|result| Movie.new(result)}
  end

end
