from collections import deque

class Node_Tree:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
    
def preorder(root):
    if(root is not None):
        print(root.data,"->",end=" ")
        preorder(root.left)
        preorder(root.right)
    
def inorder(root):
    if(root is not None):
        inorder(root.left)
        print(root.data,"->",end=" ")
        inorder(root.right)

def postorder(root):
    if(root is not None):
        postorder(root.left)
        postorder(root.right)
        print(root.data,"->",end=" ")

def levelorder(root):
    if root is None:
        return 
    q=deque()
    q.append(root)

    while q:
        levelsize=len(q)

        for i in range(levelsize):
            temp=q.popleft()
            print(temp.data,end=" ")
            if temp.left is not None:
                q.append(temp.left)
            if temp.right is not None:
                q.append(temp.right)
        print()

root=Node_Tree(12)
root.left=Node_Tree(15)
root.right=Node_Tree(25)

print("Preorder traversing")
preorder(root)
print("\nInorder traversing")
inorder(root)
print("\nPostorder traversing")
postorder(root)
print("\nlevelorder traversing")
levelorder(root)
