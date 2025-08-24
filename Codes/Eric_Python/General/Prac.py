n=int(input())
list1 = []
for _ in range(n):
    list2 = input().split(" ")
    list1.append(list2)
location = (0,0)
next_step = ""
distance = -1
curr_col = 0
for i in range(len(list1)):
    for j in range(len(list1[i])):
        if location[1]+j < n:                       # moving my location to the right, check if it is in bound
            next_step = list1[i][location[1] + j]   # list1[i] is pointing to each row;
                                                    # location[1] which is representing the col, starting at index 0
                                                    # + j means we are moving to the right for one index.
                                                    # next_step represents the the number at that spot, whether it's 0 or 1
        if next_step == "1":     
            break;                                  # if the spot is 1, that means we cannot got to the right, we end this row, move on to next row
        else:
            location = (i,curr_col)
            distance += 1                           # if the spot is 0, I can move to this next spot and calculate my route.
            if curr_col < n:
                curr_col += 1
    next_step = ""
    
print(distance)