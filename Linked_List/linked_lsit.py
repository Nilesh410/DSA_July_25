class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Linked_List:
    def __init__(self):
        self.head=None
    
    def insert_at_first(self,num):
        new_node=Node(num)
        if not self.head:
            self.head=new_node
        else:
            new_node.next=self.head
            self.head=new_node
    
    def insert_at_last(self,num):
        new_node=Node(num)
        if not self.head:
            self.head=new_node
        else:
            temp=self.head
            while temp.next is not None:
                temp=temp.next
            temp.next=new_node

    def insert_

    def display(self):
        if not self.head:
            print("Linked list empty")
        else:
            temp=self.head
            while temp:
                if temp.next is not None:
                    print(temp.data,"->",end="")
                    temp=temp.next
                else:
                    print(temp.data,end="")
                    temp=temp.next

l1=Linked_List()
l1.insert_at_first(10)
l1.insert_at_first(5)
l1.insert_at_first(12)
l1.insert_at_last(25)
l1.display()



