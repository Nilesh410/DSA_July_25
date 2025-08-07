# # arr=[[1,2],[3,4],[5,6]]
# # print(arr)
# print("Array elements are:")
print("Array elements are")
arr=[]
row=3
clmn=3
for i in range(row):
    temp=[]
    for j in range(clmn):
        ele=int(input("Enter the array ele"))
        temp.append(ele)
    arr.append(temp)

for i in range(len(arr)):
    for j in range(len(arr[0])):
        print(arr[i][j],end=" ")
    print()
 

