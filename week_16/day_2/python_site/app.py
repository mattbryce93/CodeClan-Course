from flask import Flask
# from helpers import calculator
# import helpers.calculator
from helpers.calculator import add
# from helpers.calculator import add, subtract
# from helpers.calculator import add as add_function
app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/add/<a>/<b>")
def add_route(a, b):
    a = int(a)
    b = int(b)
    return str(add(a, b))
