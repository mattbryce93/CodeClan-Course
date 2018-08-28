import time

# def say_hello():
#     return "Hello World!"
#
# hi = say_hello
#
#
# print(hi())
# print(hi)
# print(say_hello)
#
# def function_caller(callback):
#     return callback()
#
# print(function_caller(hi))
#
# def outer_fuction():
#     def inner_function():
#         print("Hello from the inner function!")
#
#     inner_function()
#
# outer_fuction()
#
# def decorate_it(callback):
#     def wrapper():
#         print("I done got decorated")
#         callback()
#
#     return wrapper
#
# def do_twice(callback):
#     def wrapper():
#         callback()
#         callback()
#     return wrapper
#
# decorator order is important
# @do_twice
# @decorate_it
# def ordinary():
#     print("I am an ordinary function")
#
# ordinary()
#
# decorated = decorate_it(ordinary)
# decorated()

def timing_function(callback):
    def wrapper():
        start_time = time.time()
        callback()
        end_time = time.time()
        return "Time it took to run the function: " + str((end_time - start_time))
    return wrapper

@timing_function
def numberAppender():
    num_list = []
    for number in (range(0, 10000)):
        num_list.append(number)
    print("Sum of all the numbers: " + str(sum(num_list)))

print(numberAppender())
