## Composition - Lab

At the moment our computer only processes output. Extend our computer so that it can process input. You should add classes for various input devices e.g. mouse, keyboard, trackpad etc.

You should then use composition to allow you to swap in/out the behaviours of the different input devices, just as we did in class for the various output devices.


### MVP

1. Create classes for at least two different input devices (e.g. mouse, keyboard). Each should have it's own attributes and methods e.g. a mouse could have a type(wireless, corded), a number of buttons etc. It could also have some methods e.g. to move, click a button etc.

2. All devices need to be able to send data to the computer so they should have a method to do this, perhaps called `sendData`, which returns a `String`

3. Create an interface which all the input device classes implement, remembering to include at least one common method in it.

4. Add an attribute to the the `Computer` class which is of the type of the interface you created. It should then have a method to get the data which calls one of the methods in the interface.



### Remember

Use TDD and git commit regularly
