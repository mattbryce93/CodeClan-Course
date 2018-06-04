require('sinatra')
require('sinatra/contrib/all')

get '/roll_die' do
  return rand(1..6).to_s
end

get '/name/:first/:last' do
  return "Hello, #{params[:first]} #{params[:last]}!"
end

get '/friends/:number' do
  friends = ["Jerry", "Elaine", "George", "Kramer"]
  index = params[:number].to_i
  return friends[index]
end

get '/friends/john' do
  return "Hi, John!"
end
