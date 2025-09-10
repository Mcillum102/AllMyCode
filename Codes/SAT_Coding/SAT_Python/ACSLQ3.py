# how to print the following pattern?
# You want to repeat from number 1 to number 16
'''
1                               # 1 number
2 3 4                           # 3 number
5 6 7 8 9                       # 5 number     
10 11 12 13 14 15 16            # 7 number
'''
nums = 1
number = 1
grid = []
stop = int(input())
while number <= stop:
        line = []
        for j in range(nums):
                line.append(number)
                number += 1
        nums += 2
        grid.append(line)
print(grid)
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


# compare the row of your pos, which is your_pos[0] with treasure_pos[0]


# Challenge upgrade:
# Try to print out the path you will go on when moving from your position to treasure.
# Example: treasure at 7, you at 19.
# You should go on a path that is: 19-14-9-8-7.
# The output for the upgrade will be: 19 14 9 8 7

