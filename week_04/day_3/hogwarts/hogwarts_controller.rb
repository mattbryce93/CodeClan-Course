require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry-byebug' )
require_relative('./models/student')
require_relative('./models/house')
also_reload('./models/*')

get '/students' do
  @students = Student.find_all()
  erb(:index)
end

get '/students/new' do
  @houses = House.find_all()
  erb(:new)
end

get '/students/:id' do
  @student = Student.find_by_id(params[:id].to_i)
  erb(:show)
end

get '/students/:id/edit' do
  @student = Student.find_by_id(params[:id].to_i)
  @houses = House.find_all()
  erb(:edit)
end

post '/students' do
  @student = Student.new(params)
  @student.save()
  @students = Student.find_all()
  erb(:index)
end

post '/students/:id' do
  @student = Student.new(params)
  @student.update()
  erb(:show)
end

post '/students/:id/delete' do
  student = Student.find_by_id(params[:id].to_i)
  student.delete()
  @students = Student.find_all()
  erb(:index)
end
