arr=[[3,2,1],[4,5,6],[7,8,9]]
key=27
flag=0
for i in range(len(arr)):
    for j in range(len(arr[0])):
        if arr[i][j]==key:
            print("Element present")
            flag=1
if flag==0:
    print("Element is not present")