# Inheritance Lab

Create an Employee Management system which uses inheritance and relationships in hibernate.

## MVP
- Create an abstract Employee class.  The employee should have a name, a NI number and a salary.

- Create a Manager class which inherits from the employee class.  The manager should also have a budget, a String department and a `List` of administrators.

- Create a Administrator class which inherits from the employee class.  The administrator should also have a manager.

- Create a `ManyToOne` relationship between the administrator and the manager.

- In a DBHelper class create all of the CRUD functions.

- In a DBManager class write a function to find all the employees for the manager.

## Extension
- Create a Department class.  The department should take in a title and a Manager.

- Change the Manager class so that the manager takes in a Department object rather than a string (remember to update the getters and setters).

- Remove the department from the Manager constructor.  The department should have a manager in its constructor but the manager should not have a department in its.

- Create a `OneToOne` association between Manager and Department.

- In DBManager write a function fo find what department the manager is accociated with.
