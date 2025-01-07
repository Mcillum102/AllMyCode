# s2 = 'Hello today is a good day'
# snew = ''
# for i in s2:
#     if not i.isspace():
#         snew += i

# max_counter = 0     # 
# max_index = 0       # this means the index of the most appeared letter
# for j in snew:
#     # .count means find the number of appearance of j in the str
#     if snew.count(j) > max_counter:
#         max_counter = snew.count(j)
#         max_index = snew.index(j)
# print(snew[max_index])

# Examples: remove all the repeated items from a list
# IT WILL CHANGE THE POSITIONS OF ELEMENTS
# num = [1,1,2,6,5,5,8,3,8,9,10]
# print(list(set(num)))