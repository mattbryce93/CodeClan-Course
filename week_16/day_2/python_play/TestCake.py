import unittest
from Cake import Cake

class TestCake(unittest.TestCase):
    def setUp(self):
        ingredients = ["Sugar", "Flour", "Chocolate"]
        self.cake = Cake("Brownie", ingredients, 5)

    def test_cake_has_name(self):
        self.assertEquals("Brownie", self.cake.name)

    def test_correct_amount_of_ingredients(self):
        self.assertEquals(3, len(self.cake.ingredients))

    def test_has_correct_rating(self):
        self.assertEquals(5, self.cake.rating)

unittest.main()
