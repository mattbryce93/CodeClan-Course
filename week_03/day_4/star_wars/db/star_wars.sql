-- End code after one-to-many lesson
DROP TABLE lightsabers;
DROP TABLE characters;

CREATE TABLE characters (
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);

CREATE TABLE lightsabers (
  id SERIAL8 PRIMARY KEY,
  character_id INT8 REFERENCES characters(id),
  hilt_metal VARCHAR(255),
  colour VARCHAR(255)
);

-- characters
INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 66);
INSERT INTO characters (name, darkside, age) VALUES ('Kylo Ren', true, 24);
INSERT INTO characters (name, darkside, age) VALUES ('Rey', false, 19);

-- lightsabers
INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('green', 1, 'palladium');
INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('red', 2, 'titanium');
