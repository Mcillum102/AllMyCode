# Function recursion: a function calling itself while inside the coding part.

# Factorial: 5! = 5x4x3x2x1 = 120
# When we do recursion, we MUST have a stop condtion inside the code.
# def factorial(num):
#     result = 0
#     if num > 0:
#         result = num * factorial(num - 1)
#     else:
#         result = 1
#     return result

# print(factorial(5))

'''
The progress of recursion (factorial):
facorial(5) calls factorial(4), result = 0, num = 4
    facorial(4) calls factorial(3), result = 0, num = 3
        facorial(3) calls factorial(2), result = 0, num = 2
            facorial(2) calls factorial(1), result = 0, num = 1
                facorial(1) calls factorial(0), result = 0, num = 0
                    factorial(0) returns 1, result = 1
                factorial(1) returns 1(num) * 1(result), result = 1
            factorial(2) returns 2(num) * 1(result), result = 2
        factorial(3) returns 3(num) * 2(result), result = 6
    factorial(4) returns 4(num) * 6(result), result = 24
factorial(5) returns 5(num) * 24(result), result = 120

Answer is 120
'''

# Sum numbers in a list
def summary(lst):
    if len(lst) == 0:
        return 0
    else:
        return lst[0] + summary(lst[1:])
print(summary([7,10,28,12,65]))

'''
The progress of recursion (factorial):
summary([7,10,28,12,65]) calls summary([10,28,12,65])
    summary([10,28,12,65]) calls summary([28,12,65])
        summary([28,12,65]) calls summary([12,65])
            summary([12,65]) calls summary([65])
                summary([65]) calls summary([])
                summary([]) returns 0
            summary([65]) returns 0 + 65
        summary([12,65]) returns 0 + 65 + 12
Answer is 122
'''