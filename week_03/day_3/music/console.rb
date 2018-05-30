require('pry')
require_relative('models/artist')
require_relative('models/album')

Album.delete_all()
Artist.delete_all()

artist1 = Artist.new({
  'name' => 'Bon Jovi'
  })

artist2 = Artist.new({
  'name' => 'Freddy Mercury'
  })

artist1.save()
artist2.save()

album1 = Album.new({
  'title' => 'Lost Highway',
  'genre' => 'American Rock',
  'artist_id' => artist1.id
  })

album2 = Album.new({
  'title' => 'News of the World',
  'genre' => 'British Rock',
  'artist_id' => artist2.id
  })

album3 = Album.new({
  'title' => 'New Jersey',
  'genre' => 'American Rock',
  'artist_id' => artist1.id
  })

album1.save()
album2.save()
album3.save()

all_albums = Album.all()
all_artists = Artist.all()

artist1_albums = artist1.albums()
album2_artist = album2.artist()

album3.genre = "Smooth Jazz"
album3.update()

artist1.name = "Limp Bizkit"
artist1.update()

album2.delete()
artist2.delete()

binding.pry
nil
