# print("flow" or "fli")

# def longestCommonPrefix(strs):
#     if len(strs) == 1:
#         return strs[0]
#     elif len(strs) == 2:
#         return strs[0] and strs[1]

#     same = strs[0] and strs[1]
#     for i in range(2, len(strs)):
#         current = strs[i]
#         same = same and current
        
#     return same

# strs = ["flower","flow","flight"]

# print(longestCommonPrefix(strs))

word = "computer"
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

queue = [tree]
result = []

while queue:
    node = queue.pop(0)
    result.append(node[0])
    if node[1]:
        queue.append(node[1])
    if node[2]:
        queue.append(node[2])

print("".join(result))
