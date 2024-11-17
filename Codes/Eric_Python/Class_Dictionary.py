# Dictionary: type is dict()
# it stores all datas as paired data
# a key:value pair
dict1 = {'name':'Martin', 'age':22, 1: [9]}
# each pair is considered as one "index" in dictionary

# a key has to be un-removeable data (numbers and strings)
# a value can be any type of data

# changing values and getting values
dict1['age'] = 100

x = dict1.get('age')        # getting values
print(dict1['age'])
print(dict1.keys())
print(dict1.values())
print(dict1.items())

# Adding
# Update is able to add or change depending on value
dict1.update({'food':'egg', 1:100})

# Removing
# Pops out key and value
dict1.pop(1)                # the 1 here is key name instead of index

# popitem doesn't take anything in bracket.
dict1.popitem()             # removes the last pair

# set default: it creats a pair of data that can no be changed, even with same keynames.
dict1.setdefault(4, 100)      # Not changeable
print(dict1)

