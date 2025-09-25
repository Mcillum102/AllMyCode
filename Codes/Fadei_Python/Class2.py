# Control Flow

# Conditions: True / False
# 4 basic conditions
# 1 < 100   -> True
# 99 > 1000 -> False
# <=, >=: beside the less or more, we also put = conditions inside

# equal and not equal:
# equal:
# 100 == 100    (double = sign will represent equal in coding)
# x = 100       (single = sign will represent variable creation)
x = 10 == 100    # x is a variable that can hold true or false. The type is called bool (boolean)
# not equal:
# 30 != 40      (! symbol means not, which gives the opposite result of the original)
# print(50 != 7)
# print(x)

# if and else
# if: creates a if condition. The code inside a if condition will be executed when the condition is true
# Format: if (keyword) condition (a true or false value) : (colon)
speed = int(input("Enter how fast you are driving: "))
if speed > 120:
    print("You're drive too fast")
else:
    print("You are under the limit")
    
# if there is more than one condition to consider, use elif (else if) keyword to insert more
tesla_color = "black"

if tesla_color == "white":
    print("Your car is white")
elif tesla_color == "black":
    print("Your car is black")
elif tesla_color == "blue":
    print("Your car is blue")
else:
    print("Your car is some other colors")
    
# input: Let the computer ask us to put in a value
word = input("Please enter your name: ")
print("Hi", word, "How are you?")