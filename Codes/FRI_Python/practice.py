wordloop = input()
while wordloop != "TTYL":
    if wordloop == 'CU':
        t1 = 'see you'
        print(t1)
    elif wordloop == ':-)':
        t2 = "i'm happy"
        print(t2)
    elif wordloop == ':-(':
        t3 = "i'm unhappy"
        print(t3)
    elif wordloop == ";-)":
        t3 = "wink"
        print(t3)
    elif wordloop == ":-P":
        t4 = 'stick out my tongue'
        print("t4")
    elif wordloop == '(~.~)':
        t5 = "sleepy"
        print(t5)
    elif wordloop == 'TA':
        t6 = 'Totally awesome'
        print(t6)
    elif wordloop == "CCC":
        t7 = 'Canadian Computing Competition'
        print(t7)
    elif wordloop == 'CUZ':
        t8 = 'because'
        print(t8)
    elif wordloop == 'TY':
        t9 = "thank-you"
        print(t9)
    elif wordloop == 'YW':
        t10 = "you're welcome"
        print(t10)
    else:
        print(wordloop)
    wordloop = input()
else:
    print("talk to you later")