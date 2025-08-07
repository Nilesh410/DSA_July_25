str="hello programmer"
arr=[0]*26

for i in str:
    if 'a'<=i<='z':
        arr[ord(i)-ord('a')]+=1
for j in range (26):
    if arr[j]>0:
        print(f"{chr(j+ord('a'))}:{arr[j]}")