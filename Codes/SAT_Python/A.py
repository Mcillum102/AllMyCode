def buildTree(word):
    tree_dict = {}
    
    def insert_node(ele, index):
        if index not in tree_dict:
            tree_dict[index] = ele
        elif ele < tree_dict[index]:
            insert_node(ele, index*2+1)
        else:
            insert_node(ele, index*2+2)
    
    if len(word) > 0:
        tree_dict[0] = word[0]
        for i in range(1, len(word)):
            insert_node(word[i], 0)
    
    positions = sorted(tree_dict.keys())
    
    answer = []
    for i in range(1, len(positions)):
        answer.append(str(positions[i] - positions[i-1] - 1))
    
    return ' '.join(answer)

print(buildTree("GASTON"))  