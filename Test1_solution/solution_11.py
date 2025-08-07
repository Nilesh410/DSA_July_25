def majority_ele(nums,n):
    count=0
    ele=0
    for i in range(0,n):
        if count==0:
            ele=nums[i]
        count+=1 if (ele==nums[i]) else -1
    return ele
# nums = [3,2,3]
nums=[2,2,1,1,2]
majority_ele=majority_ele(nums,len(nums))
print("Majority_ele=",majority_ele)