require('pg')
require('pry')

class Cowboy

  attr_accessor :name, :species, :bounty_value, :danger_level, :homeworld
  attr_reader :id

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @species = options['species']
    @bounty_value = options['bounty_value'].to_i
    @danger_level = options['danger_level']
    @homeworld = options['homeworld']
  end

  def Cowboy.all()
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = 'SELECT * FROM cowboy_list'
    db.prepare("all", sql)
    cowboys = db.exec_prepared("all")
    db.close()
    return cowboys.map {|cowboy| Cowboy.new(cowboy)}
  end

  def Cowboy.delete_all()
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = "DELETE FROM cowboy_list"
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all")
    db.close()
  end

  def Cowboy.find_by_name(name)
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = "SELECT * FROM cowboy_list WHERE name = $1"
    values = [name]
    db.prepare("find_by_name", sql)
    name_found = db.exec_prepared("find_by_name", values)
    db.close()
    found_array = name_found.map {|found_value| Cowboy.new(found_value)}
    if found_array == []
      return "We have no record of this Cowboy"
    else
      return found_array
    end
  end

  def Cowboy.find_by_id(id)
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = "SELECT * FROM cowboy_list WHERE id = $1"
    values = [id]
    db.prepare("find_by_id", sql)
    found = db.exec_prepared("find_by_id", values)
    db.close()
    found_array = found.map {|found_value| Cowboy.new(found_value)}
    if found_array == []
      return "We have no record of this Cowboy"
    else
      return found_array
    end
  end

  def save()
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = "INSERT INTO cowboy_list
    ( name,
      species,
      bounty_value,
      danger_level,
      homeworld)
      VALUES
      ($1, $2, $3, $4, $5) RETURNING *"
    values = [@name, @species, @bounty_value, @danger_level, @homeworld]
    db.prepare("save", sql)
    @id = db.exec_prepared("save", values)[0]["id"].to_i
    db.close()
  end

  def update()
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = "UPDATE cowboy_list SET
    ( name,
      species,
      bounty_value,
      danger_level,
      homeworld
      ) = ($1, $2, $3, $4, $5) WHERE id = $6"
    values = [@name, @species, @bounty_value, @danger_level, @homeworld, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close()
  end

  def delete()
    db = PG.connect({
      dbname: 'cowboys_records',
      host: 'localhost'
      })
    sql = "DELETE FROM cowboy_list where id = $1"
    values =[@id]
    db.prepare("delete", sql)
    db.exec_prepared("delete", values)
    db.close()
  end

end
