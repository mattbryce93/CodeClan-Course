require_relative('../db/sql_runner')
require( 'pry-byebug' )

class Star

  attr_accessor :id, :first_name, :last_name

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @first_name = options['first_name']
    @last_name = options['last_name']
  end

  def save()
    sql = "INSERT INTO stars (first_name, last_name) VALUES ($1, $2) returning id"
    values = [@first_name, @last_name]
    results = SqlRunner.run(sql, values).first
    @id = results['id'].to_i
  end

  def update()
    sql = "UPDATE stars SET (first_name, last_name) = ($1, $2) WHERE id = $3"
    values = [@first_name, @last_name, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM stars WHERE id = $1"
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def movies()
    sql = "SELECT * FROM movies INNER JOIN castings ON movies.id = castings.movie_id INNER JOIN stars ON stars.id = castings.star_id WHERE stars.id = $1"
    values = [@id]
    results = SqlRunner.run(sql, values)
    return results.map{|result| Movie.new(result)}
  end

  def self.find(id)
    sql = "SELECT * FROM stars WHERE id = $1"
    values = [id]
    results = SqlRunner.run(sql, values).first
    return Star.new(results)
  end

  def self.delete_all()
    sql = "DELETE FROM stars"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM stars"
    results = SqlRunner.run(sql)
    return results.map{|result| Star.new(result)}
  end

end
