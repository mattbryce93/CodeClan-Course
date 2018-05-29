require('pry-byebug')
require_relative('models/pizza_order')

PizzaOrder.delete_all()

order1 = PizzaOrder.new({
  'first_name' => 'John',
  'last_name' => 'McCollum',
  'quantity' => '10',
  'topping' => 'vegetarian'
  })

order2 = PizzaOrder.new({
  'first_name' => 'Stevie',
  'last_name' => 'Meiklejohn',
  'quantity' => '1',
  'topping' => 'flaming spicy hot beast or something'
  })



order1.save()
order2.save()

orders = PizzaOrder.all()

order1.first_name = "Fred"

order1.update()

updated_orders = PizzaOrder.all()

binding.pry
nil
