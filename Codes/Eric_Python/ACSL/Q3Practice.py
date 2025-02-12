# how to print the following pattern?
# You want to repeat from number 1 to number 16
'''
1
2 3 4
5 6 7 8 9
10 11 12 13 14 15 16
'''
# linelength = 1
# currentnumber = 1
# innerlist = []
# outerlist = []
# maxnumber = 16
# increase_length = 2
# while currentnumber <= maxnumber:
#     if len(innerlist) < linelength:
#         innerlist.append(currentnumber)
#         currentnumber += 1
#     else:
#         outerlist.append(innerlist)
#         innerlist = []
#         linelength += increase_length
# else:
#     outerlist.append(innerlist)
# print(outerlist)

# Now, based on the code above, make them as elements of a list instead of a string
# Think about the 2d list idea, you will have a list as: [[1], [2,3,4], [5,6,7,8,9], [...]]
# innerlist = []
# outerlist = []
# innerlistlength = 1
# currentnumber = 1
# maxnumber = 16
# increase_length = 2
# while currentnumber <= maxnumber:
#     while len(innerlist) < innerlistlength:
#         innerlist.append(currentnumber)
#         currentnumber += 1
#     outerlist.append(innerlist)
#     innerlist = []
#     innerlistlength += increase_length
# print(outerlist)

'''
1
2   3   4
5   6   7   8   9
10  11  12  13  14  15  16
'''
# Looking at this pattern, how do I find the shortest path from number 11 to number 4?
# Think about in a 2d list aspect, how can you calculate the distance?

# a 2d list should be like list[row][col]. In this question, try to use the row number and col number to calculate the distance
# Write a code that check where is 4 (which row/inner list)?
# num_input = list(map(int, input().split(' ')))
# index_list = []
# for num in num_input:
#     for row in range(len(outerlist)):
#         for col in range(len(outerlist[row])):
#             if outerlist[row][col] == num:
#                 index = [row, col]
#                 index_list.append(index)
#     index = []
# distance = abs(index_list[0][0] - index_list[1][0]) + abs(index_list[0][1] - index_list[1][1])
# print(distance)

in1 = input().split(', ')
in1.pop(0)
outergrid = []
innergrid = {}
index = 1
for row in range(3):
    for col in range(3):
        innergrid.update({str(index):''})
        index += 1
    outergrid.append(innergrid)
    innergrid = {}
item_index = 0
while item_index < len(in1):
    if in1[item_index] in '123':
        outergrid[0].update({in1[item_index]: in1[item_index+1]})
    elif in1[item_index] in '456':
        outergrid[1].update({in1[item_index]: in1[item_index+1]})
    elif in1[item_index] in '789':
        outergrid[2].update({in1[item_index]: in1[item_index+1]})
    item_index += 2
letters = []
for d in outergrid:
    letters.append(list(d.values()))
    
    

print(letters)

