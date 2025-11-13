# Hidden Palindrome
inp = list(input())
count = 0
# Shirnk the size of the list each time if no palindrome is found
reverse_inp = inp[::-1]
while inp != reverse_inp:
    if count % 2 == 0:
        inp.pop(0)       # if the current list is not palindrome, we remove the first element
    else:
        inp.pop(-1)     # after the first time, we removed the 1st element. We should then remove the last index next round
    reverse_inp = inp[::-1]
print(reverse_inp, inp)
print(len(inp))