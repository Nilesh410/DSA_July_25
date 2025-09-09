

class Node_Tree:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

def inorder(root):
    if root is not None:
        inorder(root.left)
        print(root.data,end=" ")
        inorder(root.right)

def insert(root,value):
    if root is None:
        return Node_Tree(value)
    if root.data>value:
        root.left=insert(root.left,value)
    if root.data<value:
        root.right=insert(root.right,value)
    return root  
def search(root,key_ele):
    if root is None or root.data==key_ele:
        return root
    if root.data>key_ele:
        return search(root.left,key_ele)
    else:
        return search(root.right,key_ele)
def isValid(root,min,max):
    if root is None:
        return True
    if root.data<min and root.data>max:
        return False
    return isValid(root.left,min,root.data) and isValid(root.right,root.data,max)

def min_ele(root):
    temp=root
    while temp.left is not None:
        temp=temp.left
    return temp.data
def max_ele(root):
    temp=root
    while temp.right is not None:
        temp=temp.right
    return temp.data

def predecessor(root):
    return max_ele(root.left)
def successor(root):
    return min_ele(root.right)

root=None
root=insert(root,12)
root=insert(root,8)
root=insert(root,4)
root=insert(root,25)
print("tree travelsing")

print("\ninorder=")
inorder(root)
print(search(root,56))

min=float('-inf')
max=float('inf')
print("is valid BST=",isValid(root,min,max))

# min ele of bst
print("Min ele of BST=",min_ele(root))

# max ele of bst
print("Max ele of BST=",max_ele(root))

# Predecessor of BST
print("Predecessor of BST=",predecessor(root))
print("Successor of BST=",successor(root))