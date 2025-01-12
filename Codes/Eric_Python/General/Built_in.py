# Built in functions: The functions that are not called by any variables or objects.
# Most of built in functions produce values, you want to assign them in variables

# range(), len(), input()
# all casting functions (int(), str(), list()...)

# 1. abs(): absolute value. Change all numbers to >= 0
i = -9999
x = abs(i)
print(i, x)

# 2. max(); min() : They are used to find the max or min terms.

# 2a. The bracket takes 1 - infinte arguments. If you provide on argument that is iterable, it will print the max or min in this iterable.
# 2b. When you comparing letters, the closer the letter is to z, the greater the letter is.
# 2c. In python, uppercase letter are consider "smaller than" lowercase letters. (Acording to ASCII)
# 2d. If you compare two different list, max or min will start comparing by indexes.

ma = max([1,2,6],[1,2,5])
print(ma)

# 3. map(): it will apply an indicated function/method onto an indicated iterable value
# 3a. map takes a function as the 1st argument.
# 3b. depending on the number of arguments that the function need, we will put the same amount of arguments after the function inside.
# 3c. for the function argument, please don't use () after the function name

str_num = '12345'
number = map(int, str_num)
print(list(number))

# Try This and use map somewhere: 
# I have string that looks like this : "5,32,61,7,72,4,3,6,435,3412" How to change to this form:
# [5,32,61,7,72,4,3,6,435,3412] all number are int in the list
str_num = "5,32,61,7,72,4,3,6,435,3412" 
list_num = str_num.split(',')           # split str_num by , in order to get a list with all number as str form
answer = map(int, list_num)             # map allows us to use int with EACH TERM in list_num (which is just int(5), int(32) ...)
                                        # this means we are casting everything in list to int

print(list(answer))                     # a map function provides map value, we must CAST TO LIST to print the answer

# the previous map function did the similar as following:
list_2 = []
for i in list_num:
    list_2.append(int(i))
print(list_2)                           # comparing to map, we need to create extra variables and loop spends more time



# 4. Use of map with self-written functions:
# We can create some functions ourselves to help us solve some specific cases.

# Ex: Multiply the numbers in list with 5
def multiply5(num):
    return num * 5

def mappingNum(l):
    answer = list(map(multiply5, l))
    return answer

list1 = [6,4,5,2,1,3,8,9,7,0]
print(mappingNum(list1))


# Homework
# Write a Python program that takes a list of floating-point numbers representing prices (e.g., 123.456) 
# and returns a list of strings where each price is formatted to two decimal places and prefixed with a dollar sign ($). 
# Use the map() function to achieve this transformation.

# Example:
# Input: [123.456, 78.9, 0.12345]
# Output: ['$123.46', '$78.90', '$0.12']
# Hint:
# Use map() with a lambda function to format each float to two decimal places using round() and string formatting.



