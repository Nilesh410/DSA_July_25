str="Aabeccda Bbcaaep"
arr=[0]*256

for i in str:
        arr[ord(i)]+=1

# To find out largest element from the array
max_occ=0
c=''
for j in range (256):
    if arr[j]>max_occ:
        max_occ=arr[j]
        c=chr(j)
print(f"max of occ char:{c}")