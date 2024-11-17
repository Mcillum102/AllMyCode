'''Casting'''
# Casting in python is converting the types of the variables into other types

# To perform a cast, we write the new type's name with a (), to surround the variable.
# n = 1234567
# n = float(n)
# print(n)

# string variable can contain any sort of data, as long as it is in between the quotations ' '. 
'''special casting that's allowed'''
# num = '12345678912345'
# print(num)

# num = int(num)
# print(num + 10000)

# num = 100
# print(str(num))

'''change from float to int'''
# # casting is not the same as numbner rounding. It simply just remove the decimals from the number
# x = 9.87
# print(round(x))
# print(int(x))


'''Input'''
# input is what we can set to the computers. The computer should take our inputs and perform the correct code with it.
# we must accept the input somewhere so that it can be stored. The most used way is create a variable to store input

# a = input('Enter a name: ')
# print(a)

'''everything we input will be defautly stored as str types'''

# use casting to get the correct type of entry for you variables.
# number = int(input())
# print(number * 100)

'''using input with loops'''
# use a loop with input can let us enter input with the set amount of times
# we don't want to enter empty thing into the computer 
# forloop ex:
# list1 = []
# x = 0
# for i in range(6):
#     x = int(input('enter the number: '))
#     list1.append(x)
# print(list1)

# whileloop ex:
# list1 = []
# i = 0
# while i < 3:
#     x = int(input('enter the number: '))
#     list1.append(x)
#     i += 1
# print(list1)
