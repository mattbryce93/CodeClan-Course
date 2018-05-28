DROP TABLE lightsabers;
DROP TABLE characters;

CREATE TABLE characters (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);

CREATE TABLE lightsabers (
  id SERIAL PRIMARY KEY,
  hilt_metal VARCHAR(255) NOT NULL,
  colour VARCHAR(255) NOT NULL,
  character_id INT REFERENCES characters(id)
);


INSERT INTO characters (name, darkside, age) VALUES ('Obi-Wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);


-- SELECT * FROM characters;
-- SELECT * FROM characters WHERE darkside = false;
-- SELECT count(*) FROM characters;
-- SELECT count(*) FROM characters WHERE darkside = true;

-- UPDATE characters SET darkside = true WHERE name = 'Anakin Skywalker';

UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name = 'Anakin Skywalker';

INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);

UPDATE characters set age = 65 WHERE name = 'Obi-Wan Kenobi';

DELETE FROM characters WHERE name = 'Darth Maul';

-- DELETE FROM characters;

-- SELECT * FROM characters ORDER BY age DESC, name DESC;

INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);

INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES ('palladium', 'green', 1);
INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES ('gold', 'red', 2);

SELECT * FROM characters ORDER BY id;
SELECT * FROM lightsabers ORDER BY id;
