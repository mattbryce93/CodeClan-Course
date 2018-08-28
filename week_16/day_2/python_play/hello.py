# print("Hello World")
# print(35)
#
# print(len("Hello World"))
#
# def say_hello():
#     print("hello")
#
# say_hello()
#
# def say_hello(name = "World"):
#     print("Hello " + name)
#
# say_hello()
# say_hello("Matthew")
#
# def say_hello(name, age):
#     print("Hello " + name + " you are " + str(age))
# # python is strongly typed which is why the integer needs to be converted to a string
# say_hello("Matthew", 25)
#
# def say_hello(name, age):
#     print("Hello " + name + " you are " + str(age))
# # python methods require the correct amount of arguments
# say_hello("Matthew")
#
# name = "Matthew"
# age = 25
# # it is possible to redefine variables
# name = "Colin"
# # even to different types (it is dynamically typed)
# name = 50
#
# print(name)
# print(age)
#
# age = 105
#
# if age > 37 and age < 100:
#     print("You're an old fart")
# elif age > 100:
#     print("You're really REALLY old")
# else:
#     print("You're a Whippersnapper")
#
# def greet(name):
#     if name == "John":
#         print("Hi John")
#     else:
#         print("Howdy, stranger")
#
# greet("John")
# greet("Matthew")
#
# my_list = ["spam", "ham", "eggs"]
# my_list.reverse()
# my_list.append("milk")
#
# print(my_list)
#
# my_tuple = ("spam", "ham", "eggs")
# my_tuple[0] = "jam"
#
# print(my_tuple)
#
# my_list = ["spam", "ham", 100, True, None]
# my_tuple = ("spam", "ham", 100, True, None)
#
# print(my_list)
# print(my_tuple)
#
# print(my_list[0:2])
#
# my_list = ["spam", "ham", 100, True, None]
#
# for thing in my_list:
#     print(thing)
#
# my_numbers = [1,2,3,4,5,6,7,8,9,10]
#
# for number in my_numbers:
#     if number % 2 == 0:
#         print(number)
#
# even_numbers = [number for number in my_numbers if number % 2 == 0]
#
# print(even_numbers)
#
# person = {
#     "name": "John",
#     "favourite_foods": ["pizza", "tofu", "coffee"]
# }
#
# print(person["name"])
# print(person.keys())
# print(person.values())
