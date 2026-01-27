class Queue:
    def __init__(self):
        self.items=[]
    
    def isEmpty(self):
        return (len(self.items)==0)
    
    def size(self):
        return len(self.items)

    def peek(self):
        if(self.isEmpty()):
            return "Queue is empty"
        else:
            return self.items[0]
    def display(self):
        if(self.isEmpty()):
            return "Queue is Empty"
        else:
            for item in self.items:
                print(item)
    def enqueue(self,num):
        self.items.append(num)

    def dequeue(self):
        if(self.isEmpty()):
            return "Queue is empty"
        else:
            return self.items.pop(0)
        
q=Queue()
q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.enqueue(40)
q.display()


print("dequeue element:", q.dequeue())
print("Top element:", q.peek())
print("Is queue  empty?", q.isEmpty())
print("Queue size:", q.size())
q.display()