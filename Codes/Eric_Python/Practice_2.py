# Question 1: Enter the year you born as input, the computer should output your age at year 2024
# Answer: (Correct)
# year = input("Please enter which year you worn born ")
# print(2024-int(year))

# Question 2: Your passcode for a website is 'poe'. If you enter the correct code, it should say 'Correct, Welcome';
#             When you enter it wrong, it should say 'Invalid Entry'
# Answer: (Correct)
# password = input("Enter password. ")
# if password == "poe":
#     print("Correct, Welcome")
# else:
#     print("Invalid Entry")

# Challenge 1: Your passcode for a website is 178352. If you enter the correct code, it should say 'Correct, Welcome';
#              When you enter it wrong, it should say 'Invalid Entry' and ask you to try more times.
#              During you re-entries, if you enter correctly, it should say 'Correct, Welcome';
#              if your tried 5 times and still not correct, it should say 'Your account is locked'
# Answer:
# password = input("Enter password. ")
# counter = 0
# while counter < 5:
#     if input == "178352":
#         print("Correct, Welcome")
#         break
#     else:
#         print("no")
#         counter += 1
# if counter >= 5:
#     print("Your account is locked")
    
# Solution:
# counter = 0
# while counter < 5:
#     if int(input("Enter password. ")) == 178352:
#         print("Correct, Welcome")
#         break
#     else:
#         print("Invalid Entry")
#         counter += 1
# if counter >= 5:
#     print("Your account is locked")

# Challenge 2: Enter a number, and the computer should tell if the number is even or odd. It should also tell you if it is a prime number.
