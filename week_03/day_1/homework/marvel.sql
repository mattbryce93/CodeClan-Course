DROP TABLE attendances;
DROP TABLE movies;
DROP TABLE people;

CREATE TABLE movies (
	id SERIAL8 PRIMARY KEY,
	title VARCHAR(255),
	year INT2,
	show_time VARCHAR(255)
);

CREATE TABLE people (
	id SERIAL8 PRIMARY KEY,
	name VARCHAR(255)
);

CREATE TABLE attendances (
	id SERIAL8 PRIMARY KEY,
	person_id INT REFERENCES people(id) ON DELETE CASCADE,
	movie_id INT REFERENCES movies(id) ON DELETE CASCADE
);

INSERT INTO people (name) VALUES ('Angelina Blyth');
INSERT INTO people (name) VALUES ('Steven Bonner');
INSERT INTO people (name) VALUES ('Matthew Bryce');
INSERT INTO people (name) VALUES ('Stephan Constantial');
INSERT INTO people (name) VALUES ('Roddy Daly');
INSERT INTO people (name) VALUES ('Adri Forczek');
INSERT INTO people (name) VALUES ('David Fulton');
INSERT INTO people (name) VALUES ('Derek Leach');
INSERT INTO people (name) VALUES ('Craig McDowall');
INSERT INTO people (name) VALUES ('Tara McKeaney');
INSERT INTO people (name) VALUES ('Cambel Millar');
INSERT INTO people (name) VALUES ('Farheen Mulla');
INSERT INTO people (name) VALUES ('Jack Murning');
INSERT INTO people (name) VALUES ('Richard Phillips-Kerr');
INSERT INTO people (name) VALUES ('Joe Pollock');
INSERT INTO people (name) VALUES ('Alan Russell');
INSERT INTO people (name) VALUES ('Greg Rutherford');
INSERT INTO people (name) VALUES ('Harjit Singh');
INSERT INTO people (name) VALUES ('Debi Skea');
INSERT INTO people (name) VALUES ('Cleyra Uzcategui');
INSERT INTO people (name) VALUES ('Peter Whittle');

INSERT INTO movies (title, year, show_time) VALUES ('Iron Man', 2008, '23:00');
INSERT INTO movies (title, year, show_time) VALUES ('The Incredible Hulk', 2008, '18:05');
INSERT INTO movies (title, year, show_time) VALUES ('Iron Man 2', 2010, '21:25');
INSERT INTO movies (title, year, show_time) VALUES ('Thor', 2011, '14:40');
INSERT INTO movies (title, year, show_time) VALUES ('Captain America: The First Avenger', 2011, '13:25');
INSERT INTO movies (title, year, show_time) VALUES ('Avengers Assemble', 2012, '22:45');
INSERT INTO movies (title, year, show_time) VALUES ('Iron Man 3', 2013, '19:00');
INSERT INTO movies (title, year, show_time) VALUES ('Thor: The Dark World', 2013, '19:50');
INSERT INTO movies (title, year, show_time) VALUES ('Batman Begins', 2005, '13:45');
INSERT INTO movies (title, year, show_time) VALUES ('Captain America: The Winter Soldier', 2014, '16:00');
INSERT INTO movies (title, year, show_time) VALUES ('Guardians of the Galaxy', 2014, '16:50');
INSERT INTO movies (title, year, show_time) VALUES ('Avengers: Age of Ultron', 2015, '23:55');
INSERT INTO movies (title, year, show_time) VALUES ('Ant-Man', 2015, '18:40');
INSERT INTO movies (title, year, show_time) VALUES ('Captain America: Civil War', 2016, '16:15');
INSERT INTO movies (title, year, show_time) VALUES ('Doctor Strange', 2016, '12:20');
INSERT INTO movies (title, year, show_time) VALUES ('Guardians of the Galaxy 2', 2017, '22:25');
INSERT INTO movies (title, year, show_time) VALUES ('Spider-Man: Homecoming', 2017, '22:25');
INSERT INTO movies (title, year, show_time) VALUES ('Thor: Ragnarok', 2017, '16:30');
INSERT INTO movies (title, year, show_time) VALUES ('Black Panther', 2018, '15:00');

INSERT INTO attendances (person_id, movie_id) VALUES (19, 4);
INSERT INTO attendances (person_id, movie_id) VALUES (4, 6);
INSERT INTO attendances (person_id, movie_id) VALUES (3, 16);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 17);
INSERT INTO attendances (person_id, movie_id) VALUES (20, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (13, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 4);
INSERT INTO attendances (person_id, movie_id) VALUES (3, 14);
INSERT INTO attendances (person_id, movie_id) VALUES (4, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (7, 12);
INSERT INTO attendances (person_id, movie_id) VALUES (3, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (20, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (11, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (7, 3);
INSERT INTO attendances (person_id, movie_id) VALUES (16, 15);
INSERT INTO attendances (person_id, movie_id) VALUES (14, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (1, 12);
INSERT INTO attendances (person_id, movie_id) VALUES (2, 8);
INSERT INTO attendances (person_id, movie_id) VALUES (7, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (3, 17);
INSERT INTO attendances (person_id, movie_id) VALUES (16, 3);
INSERT INTO attendances (person_id, movie_id) VALUES (20, 18);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 16);
INSERT INTO attendances (person_id, movie_id) VALUES (3, 6);
INSERT INTO attendances (person_id, movie_id) VALUES (10, 7);
INSERT INTO attendances (person_id, movie_id) VALUES (14, 7);
INSERT INTO attendances (person_id, movie_id) VALUES (8, 17);
INSERT INTO attendances (person_id, movie_id) VALUES (18, 10);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 3);
INSERT INTO attendances (person_id, movie_id) VALUES (9, 17);
INSERT INTO attendances (person_id, movie_id) VALUES (6, 13);
INSERT INTO attendances (person_id, movie_id) VALUES (20, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (5, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (21, 1);
INSERT INTO attendances (person_id, movie_id) VALUES (15, 7);
INSERT INTO attendances (person_id, movie_id) VALUES (5, 3);
INSERT INTO attendances (person_id, movie_id) VALUES (21, 18);
INSERT INTO attendances (person_id, movie_id) VALUES (9, 7);
INSERT INTO attendances (person_id, movie_id) VALUES (8, 15);
INSERT INTO attendances (person_id, movie_id) VALUES (10, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (21, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 12);
INSERT INTO attendances (person_id, movie_id) VALUES (16, 17);
INSERT INTO attendances (person_id, movie_id) VALUES (16, 16);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 10);
INSERT INTO attendances (person_id, movie_id) VALUES (10, 19);
INSERT INTO attendances (person_id, movie_id) VALUES (8, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (9, 10);
INSERT INTO attendances (person_id, movie_id) VALUES (14, 12);
INSERT INTO attendances (person_id, movie_id) VALUES (14, 19);
INSERT INTO attendances (person_id, movie_id) VALUES (6, 12);
INSERT INTO attendances (person_id, movie_id) VALUES (11, 12);
INSERT INTO attendances (person_id, movie_id) VALUES (14, 17);
INSERT INTO attendances (person_id, movie_id) VALUES (4, 10);
INSERT INTO attendances (person_id, movie_id) VALUES (5, 6);
INSERT INTO attendances (person_id, movie_id) VALUES (1, 4);
INSERT INTO attendances (person_id, movie_id) VALUES (9, 8);
INSERT INTO attendances (person_id, movie_id) VALUES (13, 19);
INSERT INTO attendances (person_id, movie_id) VALUES (10, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (13, 14);
INSERT INTO attendances (person_id, movie_id) VALUES (14, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (21, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (17, 1);
INSERT INTO attendances (person_id, movie_id) VALUES (12, 3);
INSERT INTO attendances (person_id, movie_id) VALUES (5, 15);
INSERT INTO attendances (person_id, movie_id) VALUES (11, 10);
INSERT INTO attendances (person_id, movie_id) VALUES (6, 1);
INSERT INTO attendances (person_id, movie_id) VALUES (18, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (4, 13);
INSERT INTO attendances (person_id, movie_id) VALUES (9, 11);
INSERT INTO attendances (person_id, movie_id) VALUES (18, 18);
INSERT INTO attendances (person_id, movie_id) VALUES (19, 16);
INSERT INTO attendances (person_id, movie_id) VALUES (11, 15);
INSERT INTO attendances (person_id, movie_id) VALUES (18, 16);
INSERT INTO attendances (person_id, movie_id) VALUES (12, 6);
INSERT INTO attendances (person_id, movie_id) VALUES (4, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (19, 9);
INSERT INTO attendances (person_id, movie_id) VALUES (9, 14);
INSERT INTO attendances (person_id, movie_id) VALUES (6, 3);
INSERT INTO attendances (person_id, movie_id) VALUES (13, 6);
INSERT INTO attendances (person_id, movie_id) VALUES (1, 15);
INSERT INTO attendances (person_id, movie_id) VALUES (19, 8);
INSERT INTO attendances (person_id, movie_id) VALUES (20, 16);
INSERT INTO attendances (person_id, movie_id) VALUES (7, 19);
INSERT INTO attendances (person_id, movie_id) VALUES (16, 8);
INSERT INTO attendances (person_id, movie_id) VALUES (6, 2);
INSERT INTO attendances (person_id, movie_id) VALUES (5, 5);
INSERT INTO attendances (person_id, movie_id) VALUES (8, 18);



-- Return ALL the data in the 'movies' table.
SELECT * FROM movies;
-- Return ONLY the name column from the 'people' table
SELECT name FROM people;
-- Oh bother! Someone at CodeClan spelled Campbell's name wrong! Change it to reflect the proper spelling (change 'Cambel Millar' to 'Campbell Miller').
UPDATE people SET name = 'Campbell Miller' WHERE id = 11;
-- Return ONLY your name from the 'people' table.
SELECT name FROM people WHERE id = 3;
-- The cinema is showing 'Batman Begins', but Batman is DC, not Marvel! Delete the entry from the 'movies' table.
DELETE FROM movies WHERE id = 9;
-- Create a new entry in the 'people' table with the name of one of the instructors.
INSERT INTO people (name) VALUES ('Colin Bell');
-- Oh no! Nefarious G5 instructor Alan Russell has decided to hijack our movie evening! Remove him from the table of people.
DELETE FROM people WHERE id = 16;
-- The cinema has just heard that they will be holding an exclusive midnight showing of 'Avengers: Infinity War'!! Create a new entry in the 'movies' table to reflect this.
INSERT INTO movies (title, year, show_time) VALUES ('Avengers: Infinity War', 2018, '00:00');
-- The cinema would also like to make the Guardian movies a back-to-back feature. Update the 'Guardians of the Galaxy' show time from 16:50 to 20:00
UPDATE movies SET show_time = '20:00' WHERE id = 11;
-- Research how to delete multiple entries from your table in a single command.
DELETE FROM people WHERE id IN (1, 10);
