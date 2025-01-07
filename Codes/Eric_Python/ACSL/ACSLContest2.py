# Step 1: Create input varaibles to store the string and values

# for i in range(5):
#     input_string = input()
#     input_list = input_string.split(", ")
    
#     format_string = input_list[0]
#     value = input_list[1]
   
#     # Step 2:
#     # Find out what's unique about each condition
#     if ',' in format_string:
#         pass
#     # priority: always put the condition that's less possible upfront
#     elif '*$' in format_string:
#         pass
#     elif '$' in format_string:
#         pass
#     elif '-' in format_string:
#         pass
#     else:
#        # Step 3.1:
#        # We want to print out N amount of * symbols, where N is the length of format_string
#        print('*' * len(format_string))
       
input_string = input()
input_list = input_string.split(", ")

format_string = input_list[0]
value = input_list[1]

# Step 2:
# Find out what's unique about each condition
if ',' in format_string:
    pass
# priority: always put the condition that's less possible upfront
elif '*$' in format_string:
    # how to find out the number of & in format string?
elif '$' in format_string:
    print("$" + value)
elif '-' in format_string:
    pass
else:
    # Step 3.1:
    # We want to print out N amount of * symbols, where N is the length of format_string
    # len of string, len of value, value
    print('*' * (len(format_string) - len(value)) + value)