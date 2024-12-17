# N = 7145032
# P = 2       # position of number reading from R
# D = 8


# N = str(N)  # change int to str first
# N = list(N) # change str to a list so we can modify

# # because we change N into str first, we need to
# # change it back to int in this step
# Pint = int(N[len(N)-P])
# # get the value we want to check about
# # use length - index read from right
# # to get the index read from left

# if Pint >= 0 and Pint <= 4:
#     Pint += D # beacuse pint(3) is < 4, we add D
#     # Pint = 3 + 8 = 11
#     # we want to get the unit digit (rightmost)
#     while Pint >= 10:
#         Pint = Pint % 10 # % 10 finds the unit digit
#     # Pint = 1 at unit digit
#     N[len(N)-P] = str(Pint)

# for i in range(len(N)-P+1, len(N)):
#     N[i] = '0'

# answer = ''
# for j in N:
#     answer += j
# print(int(answer))

# Dec-9: Q2:
# sentence = "Hi, today is Friday!"
# sen_list = sentence.split(" ")
# new_sentence = ""
# for i in sen_list:
#     if i.isalpha():
#         new_sentence += i[::-1] + ' '
#     else:
#         word = i[:-1]
#         symbol = i[-1:]
#         new_sentence += word[::-1] + symbol + ' '
        
# print(new_sentence[:-1])


# Dec-16: Q1:
# m = [3, 1]
# d = 57
# month_31days = [1,3,5,7,8,10,12]
# month_30days = [4,6,9,11]

# m[len(m)-1] += d
# if m[0] in month_31days:
#     if m[len(m)-1] > 31:
#         m[len(m)-1] -= 31
#         m[0] += 1
# elif m[0] == 2:
#     if m[len(m)-1] > 28:
#         m[len(m)-1] -= 28
#         m[0] += 1
# elif m[0] in month_30days:
#     if m[len(m)-1] > 30:
#         m[len(m)-1] -= 30
#         m[0] += 1
# if m[len(m)-1] == 0:
#     if m[0] in month_31days:
#         m[len(m)-1] = 31
#     elif m[0] == 2:
#         m[len(m)-1] = 28
#     elif m[0] in month_30days:
#         m[len(m)-1] = 30
# print(m)

# Dec-16: Q2:
# Print the pattern from doc
num = int(input("Enter the ending number: "))
print(" ", end=" ")
for k in range(1, num+1):
    print(k, end=" ")
print()
for i in range(1, num+1):
    print(i, end=" ")
    for j in range(1, num+1):
        print(i*j, end=" ")
    print()
    
