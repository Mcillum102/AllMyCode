'''Examples'''
# num = [10, 92, 46, 71, 53, 228, 26, 23, 1, 23, 9]

# # 1st way
# for j in num:                   # best for lists and other iterable data. Can be used in almost all kinds of questions
#     print(j)
    
# # 2nd way
# for i in range(len(num)):       # When the question related to changing items in the list, use this way
#     print(num[i])

# Question 1: change all numbers to their squares and print the list out
# num = [10, 6, 7, 1, 9, 2, 4]
# # Answer:
# counter = 0
# for i in range(len(num)):
#     while counter < len(num):
#         num[i] = num[i] ** 2
#         counter += 1
#     print(num)
    
# # Fixed
# for i in range(len(num)):
#     num[i] = num[i] ** 2  
# print(num)

# Question 2: check in the list to see if the number is bigger than 6. If so, print yes; otherwise, print no.
# num = [10, 6, 7, 1, 9, 2, 4, 17, 5]
# # Answer: (correct)
# for i in range(len(num)):
#     if num[i] > 6:
#         print("yes")
#     else:
#         print("no")
        
# Challenge 1: print out the biggest number in the list
# num = [18,4,35,63,34,65,78,12,8,32,28]
# # Anwser: (correct, very good)
# number = num[0]               
# for i in range(len(num)):
#     if num[i] > number:
#         number = num[i]
# print(number)

# Challenge 2 (Homework): without using sort, put the list in order from big numbers to small numbers
# num = [18,4,35,63,34,65,78,12,8,32,28]
# Answer: 
# small = num[0]
# for i in range(len(num)):
#     if num[i] < small:
#         num.append(num[i])
#         num.pop(i)
#     if num[i] > small:
#         pass
# print(num)

# Solution
# temp = 0
# for i in range(len(num)):
#     for j in range(len(num)):
#         if num[j] < num[i]:
#             temp = num[i]
#             num[i] = num[j]
#             num[j] = temp
# print(num)
        