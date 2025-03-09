# s = "CABDCABDAB"
# while 'AB' in s or 'CD' in s :
#     while 'AB' in s:
#         s = s.split('AB')
#         if '' in s:
#             s.remove('')
#         s = ''.join(s)
        
#     while 'CD' in s:
#         s = s.split('CD')
#         if '' in s:
#             s.remove('')
#         s = ''.join(s)

# print(len(s))
  
# s = "00"
# for i in range(1, len(s)):
#     score = s[:i].count('0') + s[i:].count('1')
#     max = score if max < score else max
# print(max)

nums = [1,2,3,0,0,0,2,2,2,]
max = nums.count(nums[0])
for i in nums:
    cur = nums.count(i)
    if cur > max:
        max = cur
print(max)