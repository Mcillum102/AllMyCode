# Lambda function: used as math calculation function
f1 = lambda a : a + 10 # f1 = a + 10
print(f1(10))
# lambda argument (parameter): expression

f2 = lambda b, c : c / b
print(f2(100, 10))

# Use as anonymous function (mostly as math funcitons):
# I'm creating a function that multiplies the number i, with j times. i and j are the two inputs for my function
def multiplier(j):
    return lambda i : i ** j

two = multiplier(3)
# two = lambda i : i ** j
print(two(5))