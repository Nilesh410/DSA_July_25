
def consecutive(arr,n):
    current_count=0
    max_count=0
    
    for i in range(0,n):
        if(arr[i]==1):
            current_count+=1
        else:
            current_count=0
    max_count=max(current_count,max_count)
    return max_count

arr=[1,1,0,1,1,1]
print("max count of consecutive one=",consecutive(arr,len(arr)))