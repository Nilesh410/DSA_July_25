def max_1_count(arr,row,clmn):
    index=-1
    max_count=0
    for i in range(row):
        current_count=0
        for j in range(clmn):
            if arr[i][j]==1:
                current_count+=1
        if max_count<current_count:
            max_count=current_count
            index=i
    return index


arr=[[1,1,1],[1,0,0],[1,1,1]]
row=len(arr)
clmn=len(arr[0])

print("max 1 row index:",max_1_count(arr,row,clmn))


