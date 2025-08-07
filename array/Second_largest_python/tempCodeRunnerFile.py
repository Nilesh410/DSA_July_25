n=int(input("Enter the size of array:"))

arr=[]
print(f"Enter {n} elements:")
for i in range(n):
    element = int(input(f"Element {i + 1}: "))
    arr.append(element)  # Append element to array

print("Array Elements are:")
print(arr)

largest_ele=float('-inf')
sec_largest_ele=float('-inf')
for i in range(n):
    if arr[i]>sec_largest_ele and arr[i]!=largest_ele:
        sec_largest_ele=arr[i]
print(largest_ele)
print(sec_largest_ele)

