require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry-byebug' )
require_relative('./models/pizza_order')
also_reload('./models/*')

get '/pizza-orders' do
  @orders = PizzaOrder.all()
  erb(:index)
end

get '/pizza-orders/new' do
  erb(:new)
end

get '/pizza-orders/:id' do
  @order = PizzaOrder.find(params[:id].to_i)
  erb(:show)
end

post '/pizza-orders/:id/delete' do
  order = PizzaOrder.find(params[:id].to_i)
  order.delete()
  erb(:deleted)
end

post '/pizza-orders' do
  @order = PizzaOrder.new(params)
  @order.save()
  erb(:create)
end

get '/pizza-orders/:id/edit' do
  @order = PizzaOrder.find(params[:id].to_i)
  erb(:edit)
end

post '/pizza-orders/:id' do
  @order = PizzaOrder.new(params)
  @order.update()
  erb(:update)
end
