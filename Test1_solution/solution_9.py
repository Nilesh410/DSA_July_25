def missingEle(arr,n,N):
    sum_of_n_num=(N*(N+1))/2
    sum_of_array=0
    for i in range(0,n):
        sum_of_array+=arr[i]
    return (sum_of_n_num-sum_of_array)

arr=[2,3,1,5]
N=5
missing_ele=missingEle(arr,len(arr),N)
print("Missing_ele=",missing_ele)



