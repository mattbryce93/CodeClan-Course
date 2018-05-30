DROP TABLE IF EXISTS cowboy_list;

CREATE TABLE cowboy_list (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255),
  species VARCHAR(255),
  bounty_value INT,
  danger_level VARCHAR(255),
  homeworld VARCHAR(255)
);
