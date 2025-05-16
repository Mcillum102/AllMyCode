input1 = '''
5, 9, H
11, 1, 7
19, 3, F
25, 2, B
'''
list1 = input1.split("\n")
for i in list1:
    if i == "":
        continue
    # i represents = 5, 9, H
    list2=i.split(", ")
location=list2[0]
starttime=list2[1]
endtime=list2[2]
timeworked=0
