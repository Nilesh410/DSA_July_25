
def odd_count(arr,n):
    count=0
    for i in range(0,n):
        if((arr[i]%2)!=0):
            count+=1
    return count
arr=[2,3,4,5]
print("odd ele in array=",odd_count(arr,len(arr)))

