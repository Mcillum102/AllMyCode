def solve():

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

    dp = [[float('inf')] * C for _ in range(R)]

    # Initialize the first row of dp with the costs from the first row of the grid
    for j in range(C):
        dp[0][j] = grid[0][j]

    # Iterate through the grid, calculating the minimum cost for each tile
    for i in range(1, R):
        for j in range(C):
            # Check all possible adjacent tiles in the previous row
            for prev_j in range(max(0, j - 1), min(C, j + 2)):
                dp[i][j] = min(dp[i][j], dp[i - 1][prev_j] + grid[i][j])

    # Find the minimum cost in the last row of dp
    min_cost = min(dp[R - 1])

    print(min_cost)


if __name__ == "__main__":
    solve()