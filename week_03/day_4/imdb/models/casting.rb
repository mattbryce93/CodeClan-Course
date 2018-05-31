require_relative('../db/sql_runner')
require( 'pry-byebug' )

class Casting

  attr_accessor :id, :movie_id, :star_id, :fee

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @movie_id = options['movie_id'].to_i
    @star_id = options['star_id'].to_i
    @fee = options['fee'].to_i
  end

  def save()
    sql = "INSERT INTO castings (movie_id, star_id, fee) VALUES ($1, $2, $3) returning id"
    values = [@movie_id, @star_id, @fee]
    results = SqlRunner.run(sql, values).first
    @id = results['id'].to_i
  end

  def update()
    sql = "UPDATE castings SET (movie_id, star_id, fee) = ($1, $2, $3) WHERE id = $4"
    values = [@movie_id, @star_id, @fee, @id]
    SqlRunner.run(sql, values)
  end

  def self.find(id)
    sql = "SELECT * FROM castings WHERE id = $1"
    values = [id]
    results = SqlRunner.run(sql, values).first
    return Casting.new(results)
  end

  def self.delete_all()
    sql = "DELETE FROM castings"
    SqlRunner.run(sql)
  end

  def self.all()
    sql = "SELECT * FROM stars"
    results = SqlRunner.run(sql)
    return results.map{|result| Casting.new(result)}
  end

end
