# control flow

# True or False (Bool variables)
# working = False

# if working == True:
#     print('working')
    
# if working == False:
#    print('not working')
    
# operations:
# number = 20
# # one = means setting left side variable with right side value
# # two == means comparing left and right to see if they equal to each other
# # != means not equal, testing if left side and right side are not equal
# if number >= 2:
#     print('1')
# if number <= 20:
#     print('2')
# if number == 30:
#     print('3')
# if number != 23:
#     print('4')

# Q1:
# Always check the types of your answer
# day = 2.5 + 0.5
# week = day * 7
# year = day * 365
# print(week, year)

# if/else/elif (else if)
# a = 30
# if a > 30:
#     print(30)
# # this creates another condtion to check about
# elif a == 20:
#     print(20)
# # else is used to print something while condition is false
# else:
#     print('no')

# Q2:
# num = 30

# if num >= 30:
#     print(1)
# if num != 30: # here is the start for 2nd control flow
#     print(2)
# elif num == 31:
#     print(3)
# elif num < 100:
#     print(4)
# else:
#     print(5)
    
# what will be printed when i run?
# the answer 1 and 4. Because there are two different control flows we are checking at.

# nested if
# word = 'Hello' # strings
# # 1st way to use string in conditions: check if a string is inside of a string
# if 'll' in word: # keyword in is used for all types of repeatable variable
#     print('e') # on the left of in, we write the item we want to check; on the right, is the place (variable) we are checking in
#     '''be careful about spacing. Use tab to move your code to the right place so you don't get errors'''
#     if 'a' in word:
#         print('a')
#     else:
#         print('no')
# # 2nd way to use string in conditions: check if string == specific word
# if word == 'Hello':
#     print('yes')

# short hand if-else
# a = 1
# b = 2
# print('same') if a == b else print('not') if a > b else print('added')
# elif is not included when we use short hand if
# we use if 'condition' else print() to represent elif in a short hand if.

# word operators: and/or/not
# the order of operation is: not before or before and.
# and: if both conditions are true (satisfied), it runs the code
# a = 10
# b = 18
# if not a < b or b == 20 and a != 100:
# #   false or b == 20 and a != 100 -> not a < b is false
# #   false and a != 100            -> b == 20 is false, false or false is false
# #   false -> not run the code     -> a != 100 is true, false and true is false
#     print(111)
    
# # or: if any condition is true, it runs the code
# if a < b or b == 20 or a != 100:
#     print(222)
    
# # not: if the condition is false, it runs the code
# if not b == 20:
#     print(333)

# Q3:
# a = 100
# b = 39
# c = 61

# if c + b > a:
#     print(111)
# elif b + c == a:
#     if a > b and a > c:
#         print(222)
#     if b == 40 or b < c and c > 10:
#         print(333)
#     elif not a < b:
#         print(444)
#     else:
#         print(555)
# else:
#     print(666)


    
