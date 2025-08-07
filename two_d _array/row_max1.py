
def row_max1(arr,m,n):
    max_count=0
    index=-1
    for i in range(m):
        current_count=0
        for j in range(n):
            if arr[i][j]==1:
                current_count+=1
        if max_count<current_count:
            index=i
            max_count=current_count
    return index

arr=[[1,0,1],[0,0,0],[1,0,1]]
row_index=row_max1(arr,len(arr),len(arr[0]))
print("row index has max 1=",row_index)