R = int(input())
C = int(input())
M = int(input())


grid = []
num = 1
for r in range(R):
    row_list = []
    for c in range(C):
        row_list.append(num)
        num += 1
        if num == M+1:
            num = 1
    grid.append(row_list)
print(grid)
dp = [[float('inf')] * C for _ in range(R)]
for j in range(C):
    dp[0][j] = grid[0][j]
print(dp)