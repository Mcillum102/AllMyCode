'''Tuple'''
# tuple is mostly used to store multiple set data, such as coordinates in a graph, the sides of a shape ...
# tuple is created by round bracket
# mytuple = (1,2,3,4,5)

# Tuple is unchangable and ordered. It has indexes to access elements
#mytuple[2] = 3         # this is not allowed because we cannot change things in a tuple
# print(mytuple[2])

# We can also slice a tuple to get a couple of elements out at the same time
# print(mytuple[2:])

'''Tuple does not have adding or removing methods itself'''
# We will cast the tuple into a list then change thigns inside
# mytuple = (1,2,3,4,5)
# # mytuple = list(mytuple)
# # mytuple.append(6)
# # print(tuple(mytuple))

# '''tuple methods'''
# # count method is counting the occurance of an element in tuple
# print(mytuple.count(3))

# # index method is printing the index of the element
# print(mytuple.index(4))