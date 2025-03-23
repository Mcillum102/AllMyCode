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
in1 = "2 Computer BAT"
# 1. how to extract both 2 and 'Computer BAT' from in1?
# 1a. 2 is an int, Computer must be uppercase
in1 = in1.upper()
n = int(in1[0])
word = in1[2:]
word_list = list(word)
sorted_list = [word_list[0]]
for i in range(1, len(word_list)):
    for j in range(len(sorted_list)):
        curi = word_list[i]
        curj = sorted_list[j]
        if curi.isalpha() and curj.isalpha():
            if ord(curi) <= ord(curj):
                sorted_list.insert(j, curi)
                break
    else:
        sorted_list.append(curi)
        
print(sorted_list)
