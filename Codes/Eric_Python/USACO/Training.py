n, m = map(int, input().split())
cow_heights = list(map(int, input().split()))
candy_heights = list(map(int, input().split()))

for candy in candy_heights:
    remaining_candy = candy
    for i in range(n):
        if candy == 0:
            break
        
        if cow_heights[i] < remaining_candy:
                eat = cow_heights[i]
                remaining_candy -= eat
        else:
            eat = remaining_candy
            remaining_candy = 0

        # Update the cow's height after eating
        cow_heights[i] += eat

for height in cow_heights:
    print(height)
