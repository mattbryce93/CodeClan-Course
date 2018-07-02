# Lab

Create a hibernate application

## MVP
Create a hibernate application to track details of a golfer.

- Create a database called `golferdb`.
- Add `hibernate`, `postgres`, `hibernate annotations` and `Javassist` as dependencies to pom.xml
- Create `hibernate.cfg.xml`  and `HibernateUtil` files
- Create a package called `db` and add a HibernateUtil file.
- Create a package called `models`
- In `models` create a `Golfer` class. Golfer will have a first name, last name and age
- Map the `Golfer` class to a database using hibernate.
- Add a `DBGolfer` class in `db` package and add methods to `save` and `list all` under the db package.

## Extension

- Create the remaining CRUD functionality (`update`, `find`, `delete`)
- Write a function to delete all golfers in the database.

## Hints

- Use the same `HibernateUtil.java` and `hibernate.cfg.xml` files from class today. Remember to change db name in the config file.
- Remember that Golfer will need to have empty constructor (e.g public Golfer(){}) as well as an id.
