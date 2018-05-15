def return_10
  return 10
end

def add(num1, num2)
  return num1 + num2
end

def subtract(num1, num2)
  return num1 - num2
end

def multiply(num1, num2)
  return num1 * num2
end

def divide(num1, num2)
  return num1 / num2
end

def length_of_string(string)
 return string.length
end

def join_string(string1, string2)
  return "#{string1}#{string2}"
end

def add_string_as_number(string1, string2)
 return string1.to_i + string2.to_i
end

def number_to_full_month_name(num)
  case num

  when num = 1
    return "January"
  when num = 2
    return "February"
  when num = 3
    return "March"
  when num = 4
    return "April"
  when num = 5
    return "May"
  when num = 6
    return "June"
  when num = 7
    return "July"
  when num = 8
    return "August"
  when num = 9
    return "September"
  when num = 10
    return "October"
  when num = 11
    return "November"
  when num = 12
    return "December"
  end
end

def number_to_short_month_name(num)
  case num
  when num = 1
      return "Jan"
    when num = 2
      return "Feb"
    when num = 3
      return "Mar"
    when num = 4
      return "Apr"
    when num = 5
      return "May"
    when num = 6
      return "Jun"
    when num = 7
      return "Jul"
    when num = 8
      return "Aug"
    when num = 9
      return "Sep"
    when num = 10
      return "Oct"
    when num = 11
      return "Nov"
    when num = 12
      return "Dec"

  end
end

def volume_of_cube(length, height, width)
  return length * height * width
end

def volume_of_sphere(radius)
  return  (4 / 3.to_f) * (3.14.to_f) * (radius ** 3)
end


def fahrenheit_to_celsius(temp)
  return (temp * 1.8.to_f) + 32
end
