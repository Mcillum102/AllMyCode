'''
Practice 1

# please type your code here 
inpu = '314159265
11223344
25897257
91
9876543210'
# When your input contains multiple lines, we must separate them
inpu = inpu.split('\n')       # split by the \n change line symbol can make each line an item in a list


for e in inpu:
    inp = e         # intake a string
    # check/run trough each digit? using loop?
    larger = 0      # compare with larger number to pick the next correct number 
    num = ''
    outputs = []
    for i in range(len(inp)):
        # the above for loop uses indexes, not the items themselves
        # you want to compare the current digit with larger
        num += inp[i]
        # adding each digits to num if the digit is not larger than larger
        if int(num) > larger:
            larger = int(num)
            outputs.append(num)
            num = ''
            # in the condition here, we set larger to the new number and add it
            # into the list. We also reset num.

    # as outputs list contains your answer now, how to print each number out with a space separating them
    print(' '.join(outputs))
    
'''
# Create a 8x8 matrix 
matrix = [[0 for _ in range(8)] for _ in range(8)]

inp = "2, 434, 523, 43"
inp = inp.split(', ')
R = int(inp.pop(0))      # number of rows that has tiles turned on
print(R)
# loop R times
for i in range(R):
    cord = list(inp[i])
    r = int(cord.pop(0))
    for c in cord:
        matrix[r-1][int(c)-1] = 1
press_pos = list(inp[-1])
print(press_pos)


print(matrix)

