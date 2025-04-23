def countSymmetricIntegers(low, high):
    middle = 1
    count = 0
    
    while low <= high:
        if low <= 9:
            continue
        num = list(map(int, str(low)))
        while middle < len(num):
            left = sum(num[:middle])
            right = sum(num[middle:])
            if left == right:
                count += 1
                break
            middle += 1
        low += 1
        middle = 0
    
    return count

print(countSymmetricIntegers(1,100))