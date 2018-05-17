def get_name(person)
  return person[:name]
end

def get_favorite_show(person)
  return person[:favourites][:tv_show]
end

def likes_to_eat(person, food)
  for snack in person[:favourites][:snacks]
    return true if (snack == food)
  end
  return false
end

def add_friend(person, friend)
  person[:friends].push(friend)
end

def remove_friend(person, friend)
  person[:friends].delete(friend)
end

def count_money(people)
  total_monies = 0
  for person in people
    total_monies += person[:monies]
  end
  return total_monies
end

def loan_money(lender, lendee, amount)
  lender[:monies] -= amount
  lendee[:monies] += amount
end

def list_favourite_snacks(people)
  list = []
  for person in people
    for snack in person[:favourites][:snacks]
      list.push(snack)
    end
  end
  return list.length
end

def find_loner(people)
  list = []
  for person in people
    if person[:friends].length == 0
      list.push(person[:name])
    end
  end
  return list
end
