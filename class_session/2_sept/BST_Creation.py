

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

root=None
root=insert(root,12)
root=insert(root,8)
root=insert(root,4)
root=insert(root,25)
print("tree travelsing")

print("\ninorder=")
inorder(root)
print(search(root,56))

