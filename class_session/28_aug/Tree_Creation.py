from collections import deque
class Node_Tree:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

def preorder(root):
    if root is not None:
        print(root.data,end=" ")
        preorder(root.left)
        preorder(root.right)
def inorder(root):
    if root is not None:
        inorder(root.left)
        print(root.data,end=" ")
        inorder(root.right)
def postorder(root):
    if root is not None:
        postorder(root.left)
        postorder(root.right)
        print(root.data,end=" ")

def levelorder(root):
    if root is None:
        return 
    q=deque()
    q.append(root)
    while q:

        level_size=len(q)
        for i in range(level_size):
            temp=q.popleft()
            print(temp.data,end=" ")
            if temp.left is not None:
                q.append(temp.left)
            if temp.right is not None:
                q.append(temp.right)
        print("")       


root=Node_Tree(12)
root.left=Node_Tree(15)
root.right=Node_Tree(17)
root.right.left=Node_Tree(24)
print("tree travelsing")
print("preorder=")
preorder(root)
print("\ninorder=")
inorder(root)
print("\npostorder=")
postorder(root)
print("\nlevelorder=")
levelorder(root)