'''Solution'''
# fibo_list = [1, 2]
# for i in range(2, 7):
#     fibo_list.append(fibo_list[-2] + fibo_list[-1])
# # print(fibo_list)
# # Based on the numbers in this list, how do I change h to the correct letter
# # How to add all numbers in fibo_list to letter 'h'?
# increased_amount = []
# # ord('h') gives you the unicode for h. 
# # You want to add h with each number in the fibo_list
# for i in fibo_list:
#     increased_amount.append((ord("h") + i - ord('a')) % 26 + ord('a'))
# # print(increased_amount)
# # Next step, we want to add all numbers in increased_amount to each of the letters in original string
# org_str = "ACSL c2"
# # How to add them as: A + 105, C + 106. For each letter, you are using their unicode
# answer = ""
# for i in range(len(org_str)):
#     answer += str(ord(org_str[i]) + increased_amount[i]) + " "
# print(answer[:-1])


'''Practices'''
# No 1:
# String Question -> end_other
# def end_other(a, b):
#   if a.lower().endswith(b.lower()):
#     return True
#   if b.lower().endswith(a.lower()):
#     return True
#   else:
#     return False
# a = input()
# b = input()
# print(end_other(a,b))

# No 2:
string = "zopzop"
stringlist = []
