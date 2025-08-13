class queue:
    def __init__(self):
        self.items=[]
    
    def isEmpty(self):
        return len(self.items)==0

    def size(self):
        return len(self.items)
    
    def peek(self):
        if self.isEmpty():
            return "queue is empty"
        else:
            return self.items[0]  

    def display(self):
        if self.isEmpty():
            return "queue is empty"
        else:
            for item in self.items:
                print(item)

    def enqueue(self,num):
            self.items.append(num)

    def dequeue(self):
        if self.isEmpty():
            return "queue is empty"
        else:
            return self.items.pop(0)

q=queue()
q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.enqueue(40)
q.enqueue(50)
q.display()

print("dequeue element:", q.dequeue())
print("Top element:", q.peek())
print("Is stack empty?", q.isEmpty())
print("Stack size:", q.size())
q.display()




