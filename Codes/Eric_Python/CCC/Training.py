'''Pratice 1'''
# p = int(input())
# n = int(input())
# r = int(input())

# total_infected = n
# day = 0

# while total_infected <= p:
#     day += 1
#     n *= r
#     total_infected += n

# print(day)

# Don't change the input values
# Instead, make local variables that equals to the value of inputs

'''Practice 2'''
# l = int(input())
# for _ in range(l):
#     # cast to list or which method?
#     # use .split to remove ' ' and make a new list
#     in1 = input().split(' ')
#     x = int(in1[0])
#     symbol = in1[1]
#     print(x * symbol)

'''Practice 3'''
# apples_3=int(input())
# apples_2=int(input())
# apples_1=int(input())
# bananas_3=int(input())
# bananas_2=int(input())
# bananas_1=int(input())
# apples_score = (apples_3*3)+(apples_2*2)+apples_1
# bananas_score = (bananas_3*3)+(bananas_2*2)+bananas_1
# if apples_score>bananas_score:
#     print("A")
# elif bananas_score>apples_score:
#     print("B")
# else:
#     print("T")

# scores = [0, 0]
# point = 3
# for _ in range(2):
#     for a in range(3):
#         scores[_] += int(input()) * point
#         point -= 1
#     point = 3
    
# apple, banana = scores[0], scores[1]
# if apple>banana:
#     print("A")
# elif banana>apple:
#     print("B")
# else:
#     print("T")

word = input()
word = list(word)

target = sorted(word)

counter = 0
for i in range(len(word)-1):
    if word[i] != target[i]:
        for j in range(i+1, len(word)):
            if ord(word[i]) > ord(word[j]):
                if word[j] == target[i]:
                    temp = word[i]
                    word[i] = word[j]
                    word[j] = temp
                    counter += 1
                    break

print(counter, word)
