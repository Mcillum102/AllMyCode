'''2017-2018'''
# Try 1: (not quite close)
# word = "COMPUTER"
# word_list = list(word)
# sorted_word = [word_list[0]]

# for i in range(1, len(word_list)):
#     for j in range(len(sorted_word)):
#         if not word_list[i] in sorted_word:
#             # how to use i with word_list to get the letter?
#             if ord(word_list[i]) <= ord(sorted_word[j]):
#                 sorted_word.insert(j, word_list[i])
#             else:
#                 sorted_word.append(word_list[i])
# # how to remove duplicated things in the list?

# print(word_list)
# print(sorted_word)

# Try 2: Try to do a sort with words
# in1 = "3 Computer"
# # 1. how to extract both 2 and Computer?
# # 1a. 2 is an int, Computer must be uppercase
# in1 = in1.upper()
# n = int(in1[0])
# word = in1[2:]
# word_list = list(word)
# different_letters = [word_list[n]]
# for i in range(len(word_list)):
#     for j in range(len(word_list)):
#     # Use ord(word_list[i]) to compare the unicode
#     # of each letter
#         if word_list[i].isalpha() and word_list[j].isalpha():
#             if ord(word_list[j]) > ord(word_list[i]):
#                 temp = word_list[i]
#                 word_list[i] = word_list[j]
#                 word_list[j] = temp
#     if not word_list[n] in different_letters:
#         different_letters.append(word_list[n-1])
# print(word_list)
# print(different_letters)

# Try 3:
# in1 = "7 the quick brown fox"
# 1. how to extract both 2 and 'Computer BAT' from in1?
# 1a. 2 is an int, Computer must be uppercase
# in1 = in1.upper()
# n = int(in1[0]) - 1     # postion n is 1 more than its index
# word = in1[2:]
# word_list = list(word)
# sorted_list = [word_list[0]]
# print(word_list)
# How to remove the spaces from word_list?
# Remove the spaces until the list has no space
# Hint: use if and loop to compare each item in word_list with ' '. 
# If it == ' ', we remove it using .remove(?) ? is what you need to remove
# Try it below:
# for i in word_list:
#     if i == ' ':
#         word_list.remove(i)

# How to find out the number of times index 2 contains number?
# You need to add something in your current code to be able to calculate that

# When a new letter appears at postion n in sorted_list, you want to record it down
# into somewhere

# Try to create a list to store the letters, 
# or create a int variable as count to count the number of times
# don't worry if your code is not perfect
# uniques = []
# for i in range(1, len(word_list)):
#     for j in range(len(sorted_list)):
#         curi = word_list[i]
#         curj = sorted_list[j]
#         if ord(curi) <= ord(curj):
#             sorted_list.insert(j, curi)
#             break
#     else:
#         sorted_list.append(curi)
#     if n < len(sorted_list) and not sorted_list[n] in uniques :
#         uniques.append(sorted_list[n])
        
# print(uniques)
# print(len(uniques))

'''2013-2014'''
in1 = "9678415, 4"
in1 = in1.split(", ")

numbers = list(map(int, in1[0]))
length = int(in1[1])

print(numbers)
# how to write a loop that can add up everything in a list?
total = 0
largest = 0
best = []
# for i in str_number:
#     total += int(i)
#     # Find out if total is a multiple of 5 and if it is larger than largest
#     if total % 5 == 0 and total > largest:
#         largest = total
for i in range(1, len(numbers)):
    stop = length
    sub1 = numbers[0 : i]
    if len(sub1) == length:
        break
    for j in range(i, length+i):
        sub2 = numbers[j : stop]
        sub3 = sub1 + sub2
        if len(sub3) != length:
            break
        total = sum(sub3)
        if total % 5 == 0 and total > largest:
            largest = total
            best = sub3
        stop += 1
print(largest)
# Which variable do I print? How to print each number from high to low?
best.sort(reverse=True)
for i in best:
    print(i, end="")
print()