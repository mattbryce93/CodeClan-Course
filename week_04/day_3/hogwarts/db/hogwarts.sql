DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS houses;

CREATE TABLE houses(
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255),
  logo VARCHAR(255)
);

CREATE TABLE students(
 id SERIAL4 PRIMARY KEY,
 first_name VARCHAR(255),
 last_name VARCHAR(255),
 house_id INT4 REFERENCES houses(id),
 age INT2
);
