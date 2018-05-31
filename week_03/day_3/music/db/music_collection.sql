DROP TABLE IF EXISTS albums;
DROP TABLE IF EXISTS artists;

-- Every artist should have a name, and each album should have a name/title, genre and artist ID.

CREATE TABLE artists (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE albums (
  id SERIAL4 PRIMARY KEY,
  title VARCHAR(255),
  genre VARCHAR(255),
  artist_id INT4 REFERENCES artists(id) ON DELETE CASCADE
  -- ON DELETE CASCADE means that if an artist is deleted, any foreign key matching it will also be deleted
  -- essentially if an artist is deleted, if any albums are remaining that belong to them will also be deleted
);
