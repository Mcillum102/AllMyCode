'''
This week's topic is with functions.
For all questions, please write it clearly so when we check, I know what each variable represents.
You can search for help, BUT PLEASE comment next to the code you searched.
Make sure your code works for all conditions. READ THE CODE CLEARLY!!!

Q1: Create a password checker function. When you enter a valid password, 
you should get an output that says: Valid. Otherwise, output: Invalid.
The restrictions for password is:
    1. it should be between 8 - 12 lengths.
    2. it should contain at least 1 uppercase.
    3. it should contain at least 1 lowercase.
    4. it should contain at least 1 digit.
    5. it should contain at least 1 allowed character (! _ . , *).

You should also create an input to accept inputs.
Ex1:    'PassWord.1'
        Valid
        
Ex2:    'pssowjdee'
        Invalid
'''
# def password_check(pwd):
#     result = 'Valid'
#     up = 0
#     low = 0
#     dig = 0
#     char = 0
#     if len(pwd) < 8 or len(pwd) > 12:
#         result = 'Invalid.'
#         print('Not the correct length')
#     else:
#         for i in pwd:
#             if i.isupper():
#                 up += 1
#             elif i.islower():
#                 low += 1
#             elif i.isdigit():
#                 dig += 1
#             elif i == '!' or i == '_' or i == '.' or i == ',' or i == '*':
#                 char += 1
#         if up < 1:
#             result = 'Invalid'
#             print('Missing uppercase letter')
#         if low < 1:
#             result = 'Invalid'
#             print('Missing lowercase letter')
#         if dig < 1:
#             result = 'Invalid'
#             print('Missing digit')
#         if char < 1:
#             result = 'Invalid'
#             print('Missing special character')
            
#         return result

# in1 = input('Please enter a password: ')
# print(password_check(in1))

'''
Q2: You have a small database, containing 2 users and 2 matching passwords. Create a profile checker, 
to check if you entered the correct password for the matching user.

You need to create 2 inputs, 1 for user, 1 for password.
If the password and user are matched, output: Matched user!
If the password and user are not matched, output: Wrong password!
If the user is not in data, output: No such user!
Create your own database and test the code.
Ex:		data = {
            'Martin':'12345', 
            'Peter': '777999'
        }

Input: 	user = 'Martin'
		pswd = '12345'
Output:	Matched user and password!
'''


# How to write a code that can check if I input correct user, after that check if I entered matching pswd
def password_checker(u, d):
    nocounter = 0
    userfound = False
    for i in d:
        if i == u:
            userfound = True
            print("User found!")
    if userfound == False:
        print("User not found!") 
    else:
        while nocounter < 5:
            pwd = input("Enter password: ") 
            if pwd == d.get(u):
                print("Welcome!")
                break                       # when you enter the correct password, break to exit the loop
            else:
                print("Doesn't match!")
                nocounter += 1
        else:
            print("Too many attempts!")
           
data = {'Martin':'12345', 'Peter': '777999'} 
user = input("Enter user: ")
password_checker(user, data)