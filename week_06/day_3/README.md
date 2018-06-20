### Highest Card Lab

### Model a game of Highest Card.

### Card Game Lab

This lab is to model a basic card game and implement the rules.

We aren't looking for a running game, just good TDD to demonstrate that the game works as it should.

####  Highest Card
Build a simple card game that deals one card to every player and the player with the highest card value in their hand wins.

#### Extension
Extend to now deal 2 cards to every player and the player with the highest combination of card values in their hand wins.

## Considerations / Restrictions.

1. Think about how to model a deck of cards. What are the constituent parts?
 - A deck which contains 52 cards. (What kind of data structure best models this?).
 - A card with a suit and a value. (Given the suits and number of cards is fixed, this could be a job for enums).
 - Can you think of a way to 'populate' the deck with cards? (A nested loop?).

2. Model the game.
 - Think about how to model the rules of the game (determine which hand wins etc).
 - Think about how to implement the logistics of the game (dealer deals, player guesses, etc).

3. Use test driven development. Fully test your model.
