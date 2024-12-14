# in1 = input().split(', ')
in1 = "&&&&&&,&, 1000000"
in1 = in1.split(', ')
value = 0
# how to print the & symbols out by it self
print(in1[0],in1[1])

answer = ''
# my first condition is, if there is a ',' in the symbol string big cao jdhaidhiwahdiuahidhaiduwhaiudhiuahdiuahdiuawhdiuhadhiauwdhiawhdiahdiawhdiawhdifbifb3krfbi3rfbeifheif3ribeibeiroebiebrooiegobreobioerbobor2bobeoubouebouberoubouerboubreobeorfuberofuberofuberofubrofberofubrofuberofuberoubreofberofubreoubeofubrefouberofubeofberoerfouerbfoerboreubfoerboerubforefboerfboerboruberoube
if ',' in in1[0]:
    # this counter is used to check if we have 3 elements added
    counter = 0
    for i in in1[1][::-1]:
        if counter == 3:
            answer += ','
            counter = 0
        answer += i
        counter += 1
    print(answer[::-1])
