# print(" ", end=" ")
# for k in range(1, 6):
#     print(k, end=" ")
# print()
# for i in range(1, 6):
#     for j in range(1, 6):
#         print(i*j, end=" ")
#     print()

books = "LLSLM"
    
l_list = []
m_list = []
s_list = []

l_count = 0
m_count = 0
s_count = 0

l_swaps = 0
m_swaps = 0
s_swaps = 0

for i in books:
    if l_count < books.count("L"):
        if i == "L":
            l_list.append(i)
            l_count += 1
        elif i == "M":
            m_list.append(i)
            m_count += 1
            m_swaps += 1
        elif i == "S":
            s_list.append(i)
            s_count += 1
            s_swaps += 1
    if m_count < books.count("M"):
        if i == "L":
            l_list.append(i)
            l_count += 1
            l_swaps += 1
        elif i == "M":
            m_list.append(i)
            m_count += 1
        elif i == "S":
            s_list.append(i)
            s_count += 1
            s_swaps += 1
    if s_count < books.count("S"):
        if i == "L":
            l_list.append(i)
            l_count += 1
            l_swaps += 1
        elif i == "M":
            m_list.append(i)
            m_count += 1
        elif i == "S":
            s_list.append(i)
            s_count += 1
            s_swaps += 1
            
print(l_swaps+m_swaps+s_swaps)