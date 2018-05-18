def pigLatin(sentence)

  result = ''

  # split up the string into separate strings

  words = sentence.split()

  # iterate over the array

  for word in words

    # for each word split them into letters

    letters = word.split(//)
    first_letter = letters[0]

    # remove the first letter of the word

    letters.shift()

    # add that letter to the end of the word

    letters.push(first_letter)

    # add 'ay ' to the end if the word

    letters.push('ay ')

    # concantenate words into reassembled sentence

    result += letters.join

  end

  # remove the extra space at the end of the string & capitalize the strings first letter

  result.capitalize!.chop!()

  # return new sentence

  return result

end
