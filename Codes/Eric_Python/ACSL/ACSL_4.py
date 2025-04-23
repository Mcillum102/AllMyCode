word = input()
tree = None

for ch in word:
   if tree is None:
       tree = [ch, None, None]
   else:
       node = tree
       while True:
           if ch < node[0]:
               if node[1] is None:
                   node[1] = [ch, None, None]
                   break
               else:
                   node = node[1]
           else:
               if node[2] is None:
                   node[2] = [ch, None, None]
                   break
               else:
                   node = node[2]

queue = [(tree, 0)]                   
result = {}
while queue:
    node, index = queue.pop(0)
    letter = node[0]
    result[letter] = index
    if node[1]:
        queue.append((node[1], 2 * index + 1))        # adding to the left subnode position
    if node[2]:
        queue.append((node[2], 2 * index + 2))        # adding to the right subnode position
# how to write a loop that repeats with a dictionary's values?
positions = [v for v in result.values()]
# for v in result.values():
#     positions.append(v)

# based on the length of position. 
# write another loop that starts at index 1, ends at the last index.
# find the difference between index i and index i-1 (i will always be larger)
# create a list to store each differences
pos = [str(positions[i]-positions[i-1]-1) for i in range(1, len(positions))]

print(" ".join(pos))

ex = list(enumerate(pos))
# map()
# sorted()
print(ex)

