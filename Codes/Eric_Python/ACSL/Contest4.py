'''
node = ['G', None, None] # None stands for no subnodes
Here are some conditions
# node[1] is the left node
# node[2] is the right node
# A is less than G, so we put A under the left node
# A will also have 2 subnodes
node[1] = ['A', None, None]

        G
    A    none
none none
'''
word = input()
tree = None
# Step one: Sort your list based on BST
# GASTON will be GASOTN
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
print(tree)
          
# tree is ['G', ['A', None, None], ['S', ['O', ['N', None, None], None], ['T', None, None]]]
# Based on the tree, how to get all letters out first
# node = ['parent', 'left', 'right']
# answer.appened(node[0]) # adding letter into answer list
# if left is not empty, node = node[1], 
# because left is also a list of ['parent','left','right']

# if right is not empty, node = node[2], 
# because left is also a list of ['parent','left','right']

queue = [tree]                   
result = []
row = 0
while queue:
    node = queue.pop(0)
    result.append(node[0])
    if node[1]:
        queue.append(node[1])
    if node[2]:
        queue.append(node[2])

print(result)

'''
            0                
        1       2           row 0 (2 * row + 1) left, (2 * row + 2) right
      3   4    5  6
    7  8 9 10 ...

[{0:G}, {1:A}, {2:S}, {3:None}, {4:None}, {5:O}]
GASOTN
'''