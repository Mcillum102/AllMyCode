dots = int(input('Enter the number of dots: '))
x_axis = []
y_axis = []
for i in range(dots):
    pos = input('Enter the coordinates of the points: ')
    pos = pos.split(',')
    x_axis.append(int(pos[0]))
    y_axis.append(int(pos[1]))
x_max = max(x_axis) + 1
y_max = max(y_axis) + 1
x_min = min(x_axis) - 1
y_min = min(y_axis) - 1
print(x_min, ',', y_min)
print(x_max, ',', y_max)


    
'''
5
44,62
34,69
24,78
42,44
64,10
'''