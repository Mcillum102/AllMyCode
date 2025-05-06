# ACSL Contest 1, Q1 Practice
# in1 = "314159265358 8 428"
in1 = '''124987 2 3
540670 3 9
7145042 2 8
124987 2 523
4386709 1 2'''

multiLine = in1.split('\n')
print(multiLine)
for i in multiLine:
    # We want N = 124987, P = 2, D = 3
    in1_list = i.split(' ')
    # The list will only have 3 index. How to set N,P,D to what they represent?
    N = in1_list[0]
    P = int(in1_list[1])
    D = int(in1_list[2])

    # How to read index from right to left using P?
    # We want to read numbers in N, N is a string now. Use N[-P] can help us find the pth term reading from right to left
    digit = int(N[-P])
    # How to compare that value at index P with 2 conditions?
    # Condition 1: if the number is between 0 - 4
    if 0 <= digit <= 4:
        digit += D          # find the unit digit (rightmost)
        unit = digit % 10   # replace N[-P] with unit
        # str.replace(old_sub, new_sub) will replace all the old_sub seen in the string to new_sub
        # If N = 124967, I want to replace the second 6 to 3. If I call replace now, the first 6 will also be replaced
        front = N[:-P]      # we skipped the term we want to replace and prepared the zeros we need to add
        zeros = N[len(N)-P:]    # answer is fomred with: original front + replaced unit digit + zeros
        answer = front + str(unit) + "0" * len(zeros)
    # Condition 2: if the number is between 5 - 9
    elif 5 <= digit <= 9:
        digit -= D          # find the leftmost digit
        digit = str(abs(digit)) # As a string, how to get the first item in a string?
        unit = digit[0]     # If N = 124967, I want to replace the second 6 to 3. If I call replace now, the first 6 will also be replaced
        front = N[:-P]      # we skipped the term we want to replace and prepared the zeros we need to add
        zeros = N[len(N)-P:]    # reform the string
        answer = front + unit + "0" * len(zeros)
    print(answer)