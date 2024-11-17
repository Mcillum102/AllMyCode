# Factor meaning:

testnum = 36
# when we modulus testnum by its factor, we get 0
# testfactor = 36 % 9

# 9 is a factor of 36
# print(testfactor)

# Finding 2nd largest factor of 36
testfactor = testnum - 1    # 35
while testnum >= 1:
    if testnum % testfactor == 0:
        number = testfactor
        break
    testfactor -= 1
print(number)
