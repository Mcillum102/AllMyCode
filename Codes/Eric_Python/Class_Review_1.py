''' Question 1:
You are calculating the average grades of 4 students with each of the 3 subjects. Build up a data base
that includes all the students, paired with all their grades listed. 

After that we want to find out who has the highest average and who has the lowest average.

Ex: gradebook = {
    'student1' : [98, 87, 80] (3 grades for each subject)
    'student2' : [78, 84, 90] (3 grades for each subject)
    'student3' : [100, 99, 90] (3 grades for each subject)
    ......
}
Out:
    Highest average: student3 with 96 average
    Lowest average: student2 with 84 average
'''
# gradebook = {
#     'student1' : [98, 87, 80],
#     'student2' : [78, 84, 90],
#     'student3' : [100, 99, 90]
# }
# highaverage = 0
# highs = ''
# currentaverage = 0
# lowavereage = 100
# lows = ''
# sum = 0
# for i in gradebook:
#     for j in gradebook[i]:                      # This inner loop is used to add all grades together
#         sum += j
#     currentaverage = sum // len(gradebook[i])   # find the average
#     if currentaverage > highaverage:            # Compare each average of students
#         highaverage = currentaverage
#         highs = i                               # record the person gets highest average
#     if currentaverage < lowavereage:
#         lowavereage = currentaverage
#         lows = i
#     sum = 0                                     # reset summary for next loop

# print('Highest average:', highs, "with", highaverage, "points")
# print('Lowest average:', lows, "with", lowavereage, "points")


# 1. When using for loop with dictionary, don't use range because it gives numbers instead of key names.
# 2. When a question wants us to print the keys in a dictionary, don't forget use i (the variable with for loop).
# 3. If multiple loops are invovled, use different variable names.



'''
Question 2:
There is a dictionary that includes 7 students and their favorite subject. Students are the keys,
subjects are the values.

Write a code that changes the values into keys, keys into values.
Ex:     subject1 = {                             
        'student1' : 'Math'
        'student2' : 'English'
        'student3' : 'Math'
}
# subject2 = {  keys          :    values}
               values in 1        keys in 1
  subject2 = {subject1[i] : i} # hint
Out:    subject2 = {
        'Math': ['student1','student3']
        'English': ['student2']
}

'''
subject1 = {                             
        'student1' : 'Math',
        'student2' : 'English',
        'student3' : 'Math',
        'student4' : 'PE'
}
subject2 = {}
for k,v in subject1.items():        # use loop with dictionary.items() allows us to use two variables for key and value
    if v not in subject2:           # if subject2 does not have v as key
        subject2[v] = []            # create a key in subject2 that uses the value in subject1
    subject2[v].append(k)
    
print(subject2)