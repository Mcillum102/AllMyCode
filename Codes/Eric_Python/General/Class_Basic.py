# Output from python
print('What is your name?')
print("Test")

print("What is your favorite sport?")
print("Soccer")

# variable in python is used to store values
# x (left side of the =) is the variable name, 100 (right side of the =) is the value
x = 100
print(x)
# 1. don't use a single number or use number at front for a variable name
# 2. don't use any special symbols except for underscore _

# Types of Variables
# number types:
'''Integers''' 
# int() # a type relating to whole numbers
x = 2 # x now is an integer variable
b = 50
print(x*b)
print('')
'''Floats''' # float() # a type relating to numbers with decimals
# pi = 3.1415 # pi now is a float variable
# zero = 3.0 # any number with .0 after is consider as float too

# # Calculations
# print(2+4, 1267-16)         # adding and subtracting
# print(5*3, 81/9, 47/3)      # multiplying and dividing
# # dividing a term will always give you a float answer

# # repeatable types:
# '''Stirngs''' # str() # anything surrounds by the quotations marks are considered strings
# word = 'Computer'
# letter = 'o'
# num = '1000'

# Questions 1:
# 1. please create two number variables, one has value 100, one has value 400
# 2. sum the two numbers up, and also multiply the two numbers
# x = 100
# y = 400
# 3. in the print message, i want to include: The answers are. Between the number,
# I want to say and. (Ex: The answer is 100 and 400)
# print('The answers are', x+y, 'and', x*y) # commas allows you to use different types
# print('The answers are ' + str(x+y) + ' and ' + str(x*y)) # using one type with +

# Type Casting: it means changing variables to another type.
# It can only change to those that are allowed

# Questions 2:
# a = 10
# b = 20
# a = b 
# b = b + a
# print(a, b)

'''Modulus calculation'''
# The modulus symbol is % in python. Modulus calculation is what we use to get the remainder after a division occured.
# 27 / 5 = 5 ...... 2 (2 is remainder, and we can use modulus calculation to get it.) 
# print(27 % 5)

# This is used to determine if a number is even or odd
# 8 % 2 = 0
# 17 % 2 = 1
# x = 9
# if x % 2 == 0:
#     print('even')
    
# When a number modulus 2, the result shoule be 1 or 0. 1 means odd, 0 means even.