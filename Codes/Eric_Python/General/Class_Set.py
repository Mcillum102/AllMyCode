# Set: it doesn't have order, it doesn't have indexes
# set1 = {8,7,3,9,0,8,10,32}

# unchangeable and not able to use index to print
# doesn't allow repeated item

# adding
# set1.add(8)             # adding items into set
# set1.update((4,12))     # adding another sequence into a set

# # removing
# set1.remove(8)          # cannot removing something not in a set
# set1.discard(1000)      # there won't be any errors

## not often used:
# set1.pop()                # pops out random item
# set1.clear()

# set1 = {7,3,9,0,8,10,32} # A
# set2 = {18,2,6,0,8,32,15}  # B
# # joih sets:

# # intersection: finding the item that appeared in both sets
# set3 = set1.intersection(set2)

# # difference: finding the ones that are unique in A comparing to B
# set3 = set1.difference(set2)
# set4 = set2.difference(set1)

# # symmetric_difference: exact opposite of intersection
# set3 = set1.symmetric_difference(set2)
# print(set3)

# set1.symmetric_difference_update(set2)
# print(set1)

# union: puting two sets into a new set
# set1 = {7,3,9,0,8,10,32}
# set2 = {18,2,6,0,8,32,15}

# set3 = set1.union(set2)
# print(set3)