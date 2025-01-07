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
    # Step 3.4:
    # how to start from right and add comma
    # SUGGESTION: reverse add everything, and reverse again before print
    result_string = ""
    ampersandcounter = 0
    for i in format_string:
        if i == "&":
            ampersandcounter += 1
    index = -1
    comma_counter = 1
    while ampersandcounter > 0:
        if abs(index) <= len(value):
            result_string += value[index]
        else:
            result_string += "*"
        
        if comma_counter % 3 == 0 and comma_counter < ampersandcounter:
            result_string += ','
        comma_counter += 1
        ampersandcounter -= 1
        index -= 1
    print(result_string[::-1])
# priority: always put the condition that's less possible upfront
elif '*$' in format_string:
    # Step 3.3: "combine" two different conditions
    # how to find out the number of & in format string?
    ampersandcounter = 0
    for i in format_string:
        if i == "&":
            ampersandcounter += 1
    print('*' * (ampersandcounter - len(value)) + "$" + value)
elif '$' in format_string:
    # Step 3.2:
    print("$" + value)
elif '-' in format_string:
    pass
else:
    # Step 3.1:
    # We want to print out N amount of * symbols, where N is the length of format_string
    # len of string, len of value, value
    print('*' * (len(format_string) - len(value)) + value)