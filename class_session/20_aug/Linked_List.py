class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class LL_Creation1:
    def __init__(self):
        self.head=None
    
    def insert_at_first(self,num):
        new_node=Node(num)
        if self.head==None:
            self.head=new_node
        else:
            new_node.next=self.head
            self.head=new_node
    
    def insert_at_last(self,num):
        new_node=Node(num)
        if self.head is None:
            self.head=new_node
        elif self.head.next is None:
            self.head.next=new_node
        else:
            temp=self.head
            while temp.next is not None:
                temp=temp.next
            temp.next=new_node
    def insert_at_anywhere(self,num,position):
        new_node=Node(num)
        if self.head is None:
            self.head=new_node
        else:
            temp=self.head;
            while temp is not None and temp.data is not position:
                temp=temp.next
            
            if temp is None:
                print("Lisnked list does not have pos")
                return
            else:
                new_node.next=temp.next
                temp.next=new_node



    def display(self):
        if self.head==None:
            print("Linked list is empty")
        else:
            temp=self.head
            while temp is not None:
                if temp.next is not None:
                    print(temp.data,"->",end="")
                    temp=temp.next
                else:
                    print(temp.data,end="")
                    temp=temp.next


l1=LL_Creation1()
l1.insert_at_first(33)
l1.insert_at_first(32)
l1.insert_at_first(24)
l1.display()
l1.insert_at_last(54)
print("")
l1.display()
l1.insert_at_anywhere(72,32)
print("")
l1.display()