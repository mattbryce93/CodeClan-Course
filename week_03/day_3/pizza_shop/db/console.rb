require("pry")
require_relative("../models/pizza_order")
require_relative("../models/customer")

PizzaOrder.delete_all()
Customer.delete_all()

customer1 = Customer.new({
  'name' => 'Larry'
})

customer1.save()

order1 = PizzaOrder.new({
  'topping' => 'pepperoni',
  'quantity' => '2',
  'customer_id' => customer1.id
  })

order2 = PizzaOrder.new({
  'topping' => 'cheese',
  'quantity' => '1',
  'customer_id' => customer1.id
  })


order1.save()
order2.save()

search = order1.customer()
search2 = customer1.pizza_orders()

binding.pry
nil
