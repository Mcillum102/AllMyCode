word = "GASTON"
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

print(result)
