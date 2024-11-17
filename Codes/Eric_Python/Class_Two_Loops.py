# while loop is changing the variable you create to get to the next result.
# for loop is moving to the next result and let us use our variable to print the next result.

# the word iteration/iterate is describing the action of loop/repeating
# when something is iterable, it means this variable or data must have a range we can search in.

'''for loop'''
# the structure of for loop is: for (variable) in (a sort of collections)
# for loops will move on to the next loop run by itself. For loop will never be infinite in python
'''1st use of for loop'''
# range() function gives us a range of numbers to search in as the collection.

# 1. range takes 1 number k as the stop number (this number is not included). Our loop will search from 0 to number (k - 1).
# for i in range(10):           # 1. we have a variable and a range of data to search in
#     print(i)                  # 2. what we do in the loop
    
# 2. range takes 2 numbers, the start and the stop number (stop number is not included). Our loop will search from start to stop - 1
# for i in range(1, 11):        # 1. we have a variable and a range of data to search in
#     print(i)                  # 2. what we do in the loop

# 3. range takes 3 numbers, the start and the stop number (stop number is not included), the last is called step.
#    step means how many numbers we are incrementing in each run of loop. Our loop will search from start to stop - 1, each time adding step spaces.
# for i in range(1, 11, 3):     # 1. we have a variable and a range of data to search in
#     print(i)                  # 2. what we do in the loop

'''2nd use of for loop'''
# use for loop to directly searching in iterable data
# word = 'macbook'
# for i in word:                  # 1. we have a variable and an iterable data to search in.
#     print(i)                    # 2. what we do in the loop. (print each elements/items in the iterable data). For strings, it prints each letter

'''3rd ues of for loop'''
# use len() to get how many elements are in an iterable variable
# this will give us a range of numbers that the same as the index
# index starts at 0, end at len() - 1
# word = 'macbook'
#         0123456
# print(word[3])
# for i in range(len(word)):      # i right here represent the indexes of word
#     print(word[i])              # use word[i] to represent each element


'''while loop'''
# while loop takes an condition to start. When the condition becomes false, the loop will stop.
# We want to make sure our condition will become false at some point to avoid infinte loop.

# i = 1                 # 1: changing variable
# while i <= 10:        # 2: the condition for the loop to continue
#     print(i)          # 3: what we do in the loop
#     i += 1            # 4: the increment / decrement of the variable

# i = 100
# while i > 90: # while false will skip the loop
#     print(i)
#     i = i - 1 # this means minusing number by 1 in each run of the loop. This can let us stop when i = 90
              # this line can also be written as i -= 1
      
'''keywords'''        
# keyword statements (only in loops)
# break keyword is used to exit a loop when a condition is true
# continue keyword is used to skip the rest of code in a loop
# pass keyword is used to skip the current unfinished code to avoid errors

# else keyword: if the loop didn't do anything or breaked, we will do the stuff in else

# a = 100     
# while a < 92:
#     a -= 1
#     if a == 91:
#         break
#     print(a)
# else:
#     print('no')

# word = 'macbook'
# #       0123456
# print(word[3])
# for i in range(len(word)):      # i right here represent the indexes of word
#     pass     
# else:                           
#     print(2)
    
# Question 1: Starting from 1, print all numbers in the squares from 1-7. Use while loop
# ** is represent power to; a ** b means a to the power of b
# x = 1
# while x <= 7:
#     print(x ** 2)
#     x += 1
     
# Question 2: Between number 1 and 20, print all the even numbers by using for loop.
# for i in range(2, 20, 2):
#     print(i)

# Question 3: Use a for loop, to print all the letter e in a string
# Example: word = 'eifjiefjiefeifjidfije'
# Result:  5
# word = 'eifjiefjiefeifjidfije'
# counter = 0
# for i in word:
#     if i == 'e':
#         counter += 1
# print(counter)