# 2d list: A list that includes some other lists inside
# list_2d = [[1,2,9],[2,3]]
# print(list_2d[0])           # this represents the 0th index list in list2d

# print(list_2d[0][1])        # this represents the 1st index element in list2d[0]

# list_2d.append(8)           # Make sure your list only contains same types of elements
# print(list_2d) 

# lambda function: quicker way to create a math function
# lambda takes as many parameters you need, and ONLY ONE expression
# fun1 = lambda a, b : a + b      # a and b are the same as a parameters in function
# x = 10
# print(fun1(20, 90))

# def myfunc(n):
#     i = 10
#     return lambda a : a * n

# mydoubler = myfunc(2) # lambda a : a * 2
# mytripler = myfunc(3) # lambda a : a * 3

# print(mydoubler(11))  # 11 : 11 * 2 = 22
# print(mytripler(11))  # 11 : 11 * 3 = 33

# def myfunc1(n, t):
#     return t * n

# Local and Global Variables:
# Global variales are those can be accessed anywhere in the program, created outside any functions.
# Ex:
# x = 10
# y = 200
# Local variables are those can only be accessed under a function.
# Return
# def sum(a, b):
#     s = a + b           # without using return, s is not published into global coding space. It shows none
#     return s            # provide the data into global space and become printable globally

# print(sum(x, y))

# Escape Characters
# s = "\"\n\\a\tyu\bt"
# '''
# \'	Single Quote	
# \\	Backslash	
# \n	New Line
# \t	Tab	
# \b	Backspace
# '''
# print(s)

# print(70%26)