N = 7145032
P = 2       # position of number reading from R
D = 8


N = str(N)  # change int to str first
N = list(N) # change str to a list so we can modify

# because we change N into str first, we need to
# change it back to int in this step
Pint = int(N[len(N)-P])
# get the value we want to check about
# use length - index read from right
# to get the index read from left

if Pint >= 0 and Pint <= 4:
    Pint += D # beacuse pint(3) is < 4, we add D
    # Pint = 3 + 8 = 11
    # we want to get the unit digit (rightmost)
    while Pint >= 10:
        Pint = Pint % 10 # % 10 finds the unit digit
    # Pint = 1 at unit digit
    N[len(N)-P] = str(Pint)

for i in range(len(N)-P+1, len(N)):
    N[i] = '0'

answer = ''
for j in N:
    answer += j
print(int(answer))
