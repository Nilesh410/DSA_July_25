
def target_check(arr,N,target):
    result=[-1,-1]
    for i in range (0,(N-1)):
        for j in range (1,N):
            if (arr[i]+arr[j])==target:
                print("YES")
                result[0]=i
                result[1]=j
                return result
    print("NO")
    return result
N = 5;
arr = [2,6,5,8,11]
target = 18;
result=[0]*2
result=target_check(arr,N,target)
print("result=",result[0],result[1])


