require('pry-byebug')
require_relative('models/cowboys')

Cowboy.delete_all()

cowboy1 = Cowboy.new({
  'name' => 'JimBob the Fool',
  'species' => 'Human',
  'bounty_value' => '50',
  'danger_level' => 'low',
  'homeworld' => 'Earth'
  })

cowboy2 = Cowboy.new({
  'name' => 'Ragnar the Mad',
  'species' => 'Silurian',
  'bounty_value' => '1_000_000',
  'danger_level' => 'high',
  'homeworld' => 'Terra Nova'
  })

cowboy1.save()
cowboy2.save()

cowboys = Cowboy.all()

cowboy1.bounty_value = '2000'
cowboy1.danger_level = 'medium'

cowboy1.update()

updated_cowboys = Cowboy.all()

search = Cowboy.find_by_name('JimBob the Fool')
fail_search = Cowboy.find_by_name('JimBob the Smart')

id_search = Cowboy.find_by_id(23)


binding.pry
nil
