# letters = {
#     "A" : 1,
#     "B" : 2,
#     "C" : 3,
#     "D" : 4,
#     "E" : 5,
#     "F" : 6,
#     "G" : 7,
#     "H" : 8,
#     "I" : 9,
#     "J" : 10,
#     "K" : 11,
#     "L" : 12,
#     "M" : 13,
#     "N" : 14,
#     "O" : 15,
#     "P" : 16,
#     "Q" : 17,
#     "R" : 18,
#     "S" : 19,
#     "T" : 20,
#     "U" : 21,
#     "V" : 22,
#     "W" : 23,
#     "X" : 24,
#     "Y" : 25,
#     "Z" : 26,
# }

# numbers = {}
# for k, v in letters.items():
#     numbers[v] = k
    
# str1 = ''
# for t in range(5):
#     str1 += input()

# for i in str1.upper():
#     number = int(letters.get(i))
#     if 'A' <= i <= 'E':
#         number *= 2
#         print(numbers.get(number))
#     elif 'F' <= i <= 'J':
#         number %= 3
#         number *= 5
#         print(numbers.get(number))
#     elif 'K' <= i <= 'O':
#         number //= 4
#         number *= 8
#         print(numbers.get(number))
#     elif 'P' <= i <= 'T':
#         a = number // 10
#         b = number % 10
#         absum = a + b
#         number = absum * 10
        
#         if number > 26:
#             # 70, remainder is 18, which is the 18th letter
#             number %= 26    # the number of space until Z
#             print(numbers.get(number))
#         else:
#             print(numbers.get(number))
#     elif 'U' <= i <= 'Z':
#         # find the 2nd largest factor
#         # z -> 26           25
#         for num in range(number - 1, 1, -1):
#             # ex: 26     13
#             if number % num == 0:
#                 number = num
#                 break
#         number *= 12
        
#         if number > 26:
#             number %= 26    # the number of space until Z
#             if number == 0:
#                 print(numbers.get(26))
#             else:
#                 print(numbers.get(number))
    


            
# Please think about how to complete the following vars
# my_checker = [1,5]
#               i j   i j   i j
# opponents = [[2,6],[4,6],[6,6]]
# all number in list should be actul numbers
in1 = "1,5,3,2,6,4,6,6,6"

# how to turn in1 into a list?
list1 = []
for i in in1:
    if i.isdigit():
        list1.append(int(i))

my_checker = [list1[0],list1[1]]

# list1 = [1,5,3,2,6,4,6,6,6]
# index    0 1 2 3 4 5 6 7 8

# list1[2] gives you the number of checkers we are adding
# how to write a loop that stops at list1[2] times?
# use either while or for
row = 3
col = row + 1
opponents = []
for a in range(list1[2]):
    opponents.append([list1[row], list1[col]])
    row += 2
    col += 2

jumps = 0
for op in opponents:
# b represent the coordinates of opponets
# use b to compare with my_checker
# 1. if any opponents is one row above my checker
    if op[0] == my_checker[0] + 1:
        if op[1] == 1 or op[1] == 8:
            continue
        # 2. when op is to your left, how to write it
        if op[1] == my_checker[1] - 1:
            my_checker[0] += 2
            my_checker[1] -= 2
            jumps += 1
        # 2a. when op is to your right, how to write it
        elif op[1] == my_checker[1] + 1:
            my_checker[0] += 2
            my_checker[1] += 2
            jumps += 1
print(jumps)
        
'''Homework'''
'''When you checker arrives at row 8, it becomes a king
Please print "King" when that happens'''

