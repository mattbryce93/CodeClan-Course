const assert = require('assert');
const ShoppingBasket = require('../shopping_basket.js');
const Item = require('../item.js');

describe('Item', function(){

  let item;

  beforeEach(function(){
    item = new Item('Crisps', 1.45, false);
  });


// Items should have a name, price and boolean value that determines whether or not they are eligible for a buy one get one free discount.

  it('item should have name', function(){
    assert.strictEqual(item.name, 'Crisps');
  });

  it('item should have price', function(){
    assert.strictEqual(item.price, 1.45);
  });

  it('item discount is false', function(){
    assert.strictEqual(item.discount, false);
  });

});

describe('Shopping Basket', function(){

  let shoppingBasket, item1, item2;

  beforeEach(function(){
    shoppingBasket = new ShoppingBasket();
    item1 = new Item('Crisps', 1.45, false);
    item2 = new Item('Biscuits', 3.00, false);
    item3 = new Item('Chardonnay', 25.00, false);
    item4 = new Item('Sponges', 1.00, true);
  });

  it('Basket starts empty', function(){
    assert.strictEqual(shoppingBasket.items.length, 0);
  });

  it('Basket can add items', function(){
    shoppingBasket.addItem(item1);
    assert.strictEqual(shoppingBasket.items.length, 1);
  });

  it('Basket can remove items', function(){
    shoppingBasket.addItem(item1);
    shoppingBasket.removeItem(item1);
    assert.strictEqual(shoppingBasket.items.length, 0);
  });

  it('Basket can have multiple items', function(){
    shoppingBasket.addItem(item1);
    shoppingBasket.addItem(item2);
    assert.strictEqual(shoppingBasket.items.length, 2);
  });

  it('Basket can calculate total cost with no discounts', function(){
    shoppingBasket.addItem(item1);
    shoppingBasket.addItem(item2);
    assert.strictEqual(shoppingBasket.totalCost(), 4.45);
  });

  it('Basket can apply 10% discount to totals over £20', function(){
    shoppingBasket.addItem(item3);
    assert.strictEqual(shoppingBasket.totalCost(), 22.50);
  });

  it('Basket can apply 5% discount to card Holders', function(){
    shoppingBasket.addItem(item2);
    assert.strictEqual(shoppingBasket.totalCost(true), 2.85);
  });

  it('Basket can apply 15% discount to totals over £20 with card', function(){
    shoppingBasket.addItem(item3);
    assert.strictEqual(shoppingBasket.totalCost(true), 21.25);
  });

  it('1 Bogof items is the the price of one', function(){
    shoppingBasket.addItem(item4);
    assert.strictEqual(shoppingBasket.totalCost(), 1);
    assert.strictEqual(shoppingBasket.items.length, 1);
  });

  it('2 Bogof items are the the price of one', function(){
    shoppingBasket.addItem(item4);
    shoppingBasket.addItem(item4);
    assert.strictEqual(shoppingBasket.totalCost(), 1);
    assert.strictEqual(shoppingBasket.items.length, 2);
  });

});
