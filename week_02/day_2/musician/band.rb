# ```Create a new class Band
# Band should have a name and an array of Musicians in its constructor
# Band should have a perform(song_title) method that creates a new array, calls the play_song(title) on every musician in its musicians array, then passes the strings the method returns into the new array. (Hint: Use a loop)```

class Band

  attr_reader :name, :members

  def initialize(name, members)
    @name = name
    @members = members
  end

  def perform(songname)
    song_played = []
    for member in @members
      song_played.push(member.play_song(songname))
    end
    return song_played
  end

end
