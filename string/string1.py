str="Hello Programmer"

print("length of string:",len(str))
print(str)

for i in str:
    print(i,end=" ")

reverse=""
for j in str:
    reverse=j+reverse

for i in reverse:
    print(i,end=" ")   