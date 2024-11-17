# # # f = open("/Users/shuhancao/Library/CloudStorage/OneDrive-Personal/Codes/Leet/demofile.txt")
# # # x = f.readlines()
# # # s = 's'.join(x)
# # # print(s)

# # # b = b"for\xc3\xaat"
# # # print(b.decode('utf-8'))

# # str1 = 'Helloe'
# # str1 = str1.replace('e', 'a')
# # # replace should determine the variable you are assigning to
# # # after changing the value

# # # In replace bracket, after indicating new string to replace,
# # # you can also indicate the number of times you want to replace
# # # it will start from left to right; defaultly all old string

# # str2 = str1[ : : -1] # str reverse
# # # slicing uses index to get substring from a string

# # index = str1.find('l')

# # some = "123456"

# # w = " ".join(some)

# # s = f"Hello {w}"
# # print(s)

# import re

# txt = "The rain in Spain"
# # Match type - can be used as conditions directly
# x = re.search("rain",txt)
# print(x)

# # \d means find all digits 找到所有的数字characters, 所有通过0-9组成的字符都是digits
# # {4} means the character we are looking for is excatly 4 digits 去寻找连续的4个数字；只有在大括号里有数字的情况下才是这个作用
# # - means dash 只是代表横杠
# # \w means 找到所有的Letters, Numbers and _ underscore
# # + means 根据+号前面要求寻找连续的characters，会停在第一个出现的不符合要求的character，不包含这个不符合要求的。
# # . means anything, except new line 除去\n回车符号的所有内容(一个character)

# # 如果特殊符号是黄色，那代表它现在有特殊作用；如果特殊符号是红色，它只代表符号Character。
# ex = '2024-10-24 Computer The rain in Spain'
# pattern = r'(\d{4}-\d{2}-\d{2}) (\w+) (.+)' # we are looking for something similar to 0000-
# # if we are going to use groups, we need to use () to indicated the group parts.
# # 如果你会用到groups method，那么你需要用()去给每个小组别分组

# # findall不需要group内容
# # [] 类似于and的条件，会寻找满足中括号内所有条件的characters
# emails = "martin_cao@gmail.ca 123748.5965@qq.com"
# pattern2 = r'[\w.]+@\w+\.\w+'
# result = re.findall(pattern2, emails)

# print(result)
# # When you put Match variable to if, it also checks for 
# # true of false
# # if x:
# #     print('There is a match')
# # else:
# #     print('There is no match')

# # print(txt)
# ex2 = ",dog,cat,"
# word = re.split(r',', ex2)
# word = [w for w in word if w]   # this is short hand for loop that DON'T need new list

# word2 = []
# for w in word:                  # for all elements in word
#     if w:                       # if this element exist (not empty); if there's no value, it's false.
#         word2.append(w)         # adding w to new list
# print(word2)

# 避免code出现error
# try:
#     x = 'you'
#     print(x+9)
# except:
#     print()
# list1 = [2,10,47,1,9,30,26]
# def mult5(x):
#     return x * 5

# new_list = map(mult5, list1)
# print(list(new_list))


# s  = 'swiss'

# This dictionary is prepared to store the occurance of each letter, as letter:occurance form
# l = {}                        


# This Loop is used to count the number of occurance of each letter; Then, stores the letters as keys, occurance as value
# for i in s:                   
#     l[i] = s.count(i)

# This Loop is searching in the dictionary, to see which letter appeared once only, and will stop the loop after printing the first one
# for j in s:
#     if l[j] == 1:
#         print(j)
#         break

string1 = "swiss"
counter = { }
nonrepeat = ""
for i in string1:
    counter[i.lower()] = string1.count(i)

for i in counter.keys():
    if counter.get(i) == 1:
        nonrepeat = i
        break
print(nonrepeat)

























