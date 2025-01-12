# # in1 = input().split(', ')
# in1 = "&&&&&&,&, 1000000"
# in1 = in1.split(', ')
# value = 0
# # how to print the & symbols out by it self
# print(in1[0],in1[1])

# answer = ''
# # my first condition is, if there is a ',' in the symbol string big cao start_indexdhaidhiwahdiuahidhaiduwhaiudhiuahdiuahdiuawhdiuhadhiauwdhiawhdiahdiawhdiawhdifbifb3krfbi3rfbeifheif3ribeibeiroebiebrooiegobreobioerbobor2bobeoubouebouberoubouerboubreobeorfuberofuberofuberofubrofberofubrofuberofuberoubreofberofubreoubeofubrefouberofubeofberoerfouerbfoerboreubfoerboerubforefboerfboerboruberoube
# if ',' in in1[0]:
#     # this counter is used to check if we have 3 elements added
#     counter = 0
#     for i in in1[1][::-1]:
#         if counter == 3:
#             answer += ','
#             counter = 0
#         answer += i
#         counter += 1
#     print(answer[::-1])


# in1 = input().split(', ')
# in1 = "&&&&-, -123"
# in1 = in1.split(', ')
# value = 0
# # how to print the & symbols out by it self
# print(in1[0],in1[1])


# answer = ''
# # my first condition is, if there is a ',' in the symbol string
# if ',' in in1[0]:
#     # this counter is used to check if we have 3 elements added
#     counter = 0
#     for i in in1[1][::-1]:
#         if counter == 3:
#             answer += ','
#             counter = 0
#         answer += i
#         counter += 1
#     print(answer[::-1])
# elif '*$' in in1[0]:
#     answer += '*$'
#     answer += in1[1]
#     print(answer)
# elif '$' in in1[0]:
#     answer += '$'
#     answer += in1[1]
#     print(answer)
# elif '-' in in1[0]:
#     answer += in1[1]
#     answer += '-'
#     print(answer)

'''Dec-21 ACSL Q3'''
letter_value = {"A":1,
                "E":1,
                "D":2,
                "R":2,
                "B":3,
                "M":3,
                "V":4,
                "Y":4,
                "J":8,
                "X":8}
word = input().split(", ")
indexes = []
for i in range(5):
    indexes.append(int(input()))

value = 0
multiplier = 1

for j in indexes:
    start_index = j
    for k in word:
        if start_index%3==0 and start_index%2!=0:
            value += letter_value[k] * 2
        elif start_index%5==0:
            value += letter_value[k] * 3
        elif start_index%7==0:
            value += letter_value[k]
            multiplier*=2
        elif start_index%8==0:
            value += letter_value[k]
            multiplier*=3
        else:
            value += letter_value[k]
        start_index += 1
    print(value*multiplier)
    value = 0
    multiplier = 1
