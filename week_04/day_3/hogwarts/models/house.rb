require_relative('../db/sql_runner')
require('pry-byebug')

class House

  attr_reader :id, :name

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @logo = options['logo']
  end

  def save()
    sql = "INSERT INTO houses (name, logo) VALUES ($1, $2) returning id"
    values = [@name, @logo]
    result = SqlRunner.run(sql, values).first
    @id = result['id']
  end

  def self.delete_all()
    sql = "DELETE FROM houses"
    SqlRunner.run(sql)
  end

  def self.find_all()
    sql = "SELECT * FROM houses"
    results = SqlRunner.run(sql)
    return results.map {|result| House.new(result)}
  end

  def self.find_by_id(id)
    sql = "SELECT * FROM houses WHERE id = $1"
    values = [id]
    result = SqlRunner.run(sql, values).first
    return House.new(result)
  end
end
