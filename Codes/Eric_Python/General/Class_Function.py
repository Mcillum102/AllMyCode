# how to create a function
# function: A function is a block of code which only runs when it is called.
# You can pass data, known as parameters, into a function.
# A function can return data as a result.

# Example
def password_check(p):          # p is parameter/arugument
    if p == "poe":
        print("Correct, Welcome")
    else:
        print("Invalid Entry")

password = input("Enter password. ")
password_check(password)           # calling the function