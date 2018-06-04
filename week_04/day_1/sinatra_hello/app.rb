require('sinatra')
require('sinatra/contrib/all')

get '/hi' do
  return 'Hi World!'
end
