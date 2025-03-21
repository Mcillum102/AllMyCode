nums = [0,1,1,1,0,0]
count0, count1 = nums.count(0), nums.count(1)
flips = 0
if len(nums) > 2:
    if count0 > count1:
        for i in range(len(nums)-3):
            nums[i] = 1 if nums[i] == 0 else 0
            nums[i+1] = 1 if nums[i] == 0 else 0
            nums[i+2] = 1 if nums[i] == 0 else 0
print()
            
