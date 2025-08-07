def max_row_sum(arr,row,clmn):
    index=-1
    max_sum=0
    for i in range(row):
        current_sum=0
        for j in range(clmn):
            current_sum+=arr[i][j]
        if max_sum<current_sum:
            max_sum=current_sum
            index=i
    return index


arr=[[1,0,1],[1,0,0],[1,1,1]]
row=len(arr)
clmn=len(arr[0])

print("max row sum index:",max_row_sum(arr,row,clmn))


