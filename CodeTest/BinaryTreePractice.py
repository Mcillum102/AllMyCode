# Binary Tree Search 
# word = "canada"
#         012345
'''
1: a -> c: a is "smaller" than c, we put to the left of c
2: n -> c: n is "larger: than c, we put to the right of c
                c
            a       n
3: a -> c; a -> a: a equals a, we put it to the left of a
                c
            a       n
        a

[c, leftNode, rightNode]
'''


# 1st loop:
'''
                        c (index 0)
            none (index 1)    none (index 2)
'''

# 2nd loop:
'''
                        c (index 0)
            none (index 1)                  [o (index 0)
                                none (index 0)        none (index 1)]
'''

# 3rd loop:
'''
                        c (index 0)
            none (index 1)                  [o (index 0)
                                none (index 0)        none (index 1)] (index 2 of the c list)
                                
# 1st inner loop:
node = [c, none, [o, none, none]]
m > c, so we trigger the else conditon

node[2] is not none, we set node to node[2]
node = [o, none, none]

# 2nd inner loop:
node = [o, none, none]
m < o, so we create another node list and put it in node[1]
node = [o, [m, none, none], none]

                                    c (index 0)
            none (index 1)                  [o (index 0)
                                [m (index 0)        none (index 1)] (index 2 of the c list)
                        none                none]
'''

word = "computer"
tree = None

for ch in word:
    # ch is each letter in word
    if tree is None:
        tree = [ch, None, None]
    else:
        node = tree
        while True:
            # we compare the current letter in search loop with the parent node
            if ch < node[0]:                    # comparing letter postion in alphabetical order, ex: o > c means o is after c
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

# tree contains the result of binary sorted word. Reading from top down, left right order.
# computer after binary sort will be compeutr
# your goal is to first make the code that can perform the binary sort with a given word
# queue = [tree]
# result = []

# while queue:
#     node = queue.pop(0)
#     result.append(node[0])
#     if node[1]:
#         queue.append(node[1])
#     if node[2]:
#         queue.append(node[2])

# print("".join(result))

# Based on the tree list, can you figure out how many avaiable spots are there for each node to have sub nodes?
'''
['c', None, ['o', ['m', ['e', None, None], None], ['p', None, ['u', ['t', ['r', None, None], None], None]]]]

c -> none, o        1
o -> m, p           0
m -> e, none        1
e -> none, none     2

p -> none, u        1
u -> t, none        1
t -> r, none        1
r -> none, none     2
                    9 spots for sub nodes

'''
# You will need a loop to run through tree list. Tree list has tree[1], tree[2] can possiblily be list too.
# The loop should check each item in list. If it is none, you add it into a counter. If it is a list, you should enter
# this list and do the same check

subnodes = 0
newtree = [tree]
# while tree is not none (not empty)

result = []
while newtree:
    # i will represent each item in the current tree,
    # i -> c, none, [rest of the nodes]
    # if i is none, count it as an avaiable sub node
    # tree[0] is the node head, tree[1] or tree[2] could be none or subnodes
    
    node = newtree.pop(0)
    #                                                                 0        1          2
    # based on the loop, node is pointing to each group of nodes with [parent, leftchild, rightchild]
    result.append(node[0])
    if node[1]: # if the left node is not none (empty)
        newtree.append(node[1])
    else:
        subnodes += 1
        result.append(" ")
    if node[2]: # if the right node is not none (empty)
        newtree.append(node[2])
    else:
        subnodes += 1
        result.append(" ")
    
    # Now as we walked through the loop, how can we put each letter out into a list?
    # When it is none, how can we add a empty space into the list

    # You should add parent into the new list, check if left or right is none.
    # if none, add a space into the new list
        
        
    
print(f"{subnodes} subnodes")
print(result)

