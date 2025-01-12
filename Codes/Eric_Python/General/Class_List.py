'''List'''
# list is a variable that can store multiple data/elements at the same time.
# mylist1 = [1,2,3,4,5,6]
# mylist2 = ['a','b','c','d']
# mylist3 = [1,'a',5,'oeroek']

# list is changable and is ordered
# index is also in list, same use as in string
# mylist1 = [1,3,4,2,6,8]
#            0 1 2 3 4 5                  # replacing a number at given index
# print(mylist1)

# list has many unique built-in functions that can help us to make changes or get answers
# use .functionname to let the variable use the function
'''adding things in list'''
# mylist1.append(9)                 # append adds element at the end
# mylist1.insert(3, 5)              # insert element before given index
# mylist1.extend([1,4,5])           # extend another iterable data to the end of the list
# print(mylist1)
# mylist2 = [54,32]                 # using a + symbol can add two list together, must have a new variable to contain the result
# print(mylist1 + mylist2)          # or you can directly print the result

'''removing from the list'''
# mylist1.remove(6)                 # removes the 1st appearance of the element; CANNOT remove something not in list
# mylist1.pop(2)                    # pops out the element at given index; pop also creates a new value which is the element popped from list
# print(mylist1)           

'''changing items in the list'''
# mylist1 = [1,3,4,2,6,8]
#            0 1 2 3 4 5
# print(mylist1[5])                 # this is the way to print out single data from the list
# mylist1[4] = 7                    # change the value at the given index in the list
# print(mylist1)  

# Question 1: Keep the list with all numbers

# 1. Remove the one item that should not be in this list
# 2. Add another number 90 at the very back
# 3. We have a number in the wrong type, change it to the correct type (int type)
# test = [12,291,23,4,'c',54,299,302,9,'5']
# test.remove('c')
# test.append(90)
# test[8] = 5
# print(test)

'''list slicing'''
# mylist2 = [12,291,23,4,54,299,302,9]
#             0  1   2 3  4  5   6  7  8(length)
# slicing will start from left index and stop before the right index (right index not inclusive)
# Form 1:
# print(mylist2[4:])                # when you see [] and : combined, it is using slicing method
# if start is missing, it means we defaultly start at 0.
# if stop is missing, it means we defaultly end before length of list.

# Form 2:
# print(mylist2[::])                # when you see [] and 2 :, it it slicing with indicated steps.
# if step is missing, it means we defaulty skips by 1

# we can use negative steps to print the list reversly
# print(mylist2[::-1])                

'''negative index'''
# Start from -1, and count the list from the back to the front
# mylist2 = [12,291,23,4,54,299,302,9]
#           0  1   2 3  4  5   6  7  8(length)
#          -8  -7 -6 -5 -4  -3  -2 -1
# print(mylist2[1:-2])

'''Special Functions'''
# mylist2 = [12,291,23,4,54,299,302,9]
# sorting the list
# mylist2.sort()                    # sort the list from small to big
# mylist2.sort(reverse=True)        # sort the list from small to big

# print(mylist2[::-1])
# print(mylist2)

# print the list reversely
# mylist2.reverse()                 # reverse the list (reverse the order of everything)
# print(mylist2)

# tell the index of 1st time of given item
# print(mylist2.index(54))

# count number of appearance of the given item
# print(mylist2.count(4))

# copy the list to another new list
# a = mylist2.copy()

# clear everything in list and makes an empty list
# mylist2.clear()
# print(mylist2)
