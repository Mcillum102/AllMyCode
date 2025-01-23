'''What is unicode?'''
# Unicode is a technique that stores characters as numbers in computer
# Unicode uses decimal numbers
# We use the ord() function to translate string characters to int numbers
print('a')
print('the unicode for a is', ord('a'))

# As we get the unicode for 'a', we can increase it to get another unicode for another character
print(ord('a') + 10)
# This gives me 107, which is a unicode for another alphabet character
# We then use the chr() function to find out which alphabet it is
print('the letter with unicode', ord('a') + 10, 'is' ,chr(ord('a') + 10))

# Write a loop that can print 0-9

# Write a loop that can print a-i
letters = {}
le_list = []
for i in range(ord('A'), ord('Z')+1):
    le_list.append(chr(i))
    letters.update({chr(i):0})
print(letters)
print(le_list)

'''How to write a fibonacci sequence'''
fibo_list = [1, 2]
# I want to add the sum of this two numbers in list, into the list
for i in range(2, 7):
    fibo_list.append(fibo_list[-2] + fibo_list[-1])
print(fibo_list)

