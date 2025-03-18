# how to print the following pattern?
# You want to repeat from number 1 to number 16
'''
1
2 3 4
5 6 7 8 9
10 11 12 13 14 15 16
17 
'''
linelength = 1
currentnumber = 1
innerlist = []
outerlist = []
maxnumber = 25
increase_length = 4
while currentnumber <= maxnumber:
    if len(innerlist) < linelength:
        innerlist.append(currentnumber)
        currentnumber += 1
    else:
        outerlist.append(innerlist)
        innerlist = []
        linelength += increase_length
else:
    outerlist.append(innerlist)
print(outerlist)

for i in range(len(outerlist)):
    for j in range(len(outerlist[i])):
        if outerlist[i][j] == 24:
            mcord = [i,j]
        if outerlist[i][j] == 25:
            ncord = [i,j]

print(abs(mcord[0]-ncord[0]))



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

# in1 = input().split(', ')
# in1.pop(0)
# outergrid = [['' for k in range(3)] for j in range(3)]

# # Adding the known letters
# item_index = 0
# while item_index < len(in1):
#     position = int(in1[item_index]) - 1
#     row, col = position // 3, position % 3
#     outergrid[row][col] = in1[item_index + 1]
#     item_index += 2

# # Adding the others
# for row in range(3):
#     for col in range(3):
#         if outergrid[row][col] == '':
#             current_row = set(outergrid[row])
#             current_col = {outergrid[i][col] for i in range(3)}
#             availables = {'A', 'B', 'C'} - (current_row | current_col)
            
#             if len(availables) >= 1:
#                 outergrid[row][col] = availables.pop()
# for r in outergrid:
#     for c in r:
#         print(c, end='')
# print()


# grid = [[1,2,3,4,5],
#         [6,7,8,9,10],
#         [11,12,13,14,15],
#         [16,17,18,19,20],
#         [21,22,23,24,25]]
# x = int(input())
# y = int(input())
# for i in range(len(grid)):
#     for j in range(len(grid[i])):
#         if grid[i][j] == x:
#             treasure_pos = [i, j] # this way we know where x is in the grid
#         if grid[i][j] == y:
#             your_pos = [i, j]
# idifference = abs(treasure_pos[0] - your_pos[0])
# jdifference = abs(treasure_pos[1] - your_pos[1])
# distance = idifference+jdifference 

# Challenge upgrade:
# Try to print out the path you will go on when moving from your position to treasure.
# Example: treasure at 7, you at 19.
# You should go on a path that is: 19-14-9-8-7.
# The output for the upgrade will be: 19 14 9 8 7
# path_list = [grid[your_pos[0]][your_pos[1]]]      # Records all the grid number that we walked on

# # The following while loop compares your row postion and the treasure's row position
# for i in range(2):
#     while your_pos[i] != treasure_pos[i]:
#         if your_pos[i] > treasure_pos[i]:
#             your_pos[i] -= 1
#             path_list.append(grid[your_pos[0]][your_pos[1]])
#         elif treasure_pos[i] > your_pos[i]:
#             your_pos[i] += 1
#             path_list.append(grid[your_pos[0]][your_pos[1]])

# Please think about the code to write, so you are moving towards the treasure based on col
# Compare your col with treasure's col
# while your_pos[1] != treasure_pos[1]:
#     if your_pos[1] > treasure_pos[1]:
#         your_pos[1] -= 1
#         path_list.append(grid[your_pos[0]][your_pos[1]])
#     elif treasure_pos[1]>your_pos[1]:
#         your_pos[1] += 1
#         path_list.append(grid[your_pos[0]][your_pos[1]])
# print(path_list)



# How to do a binary search with the word: Computer?

