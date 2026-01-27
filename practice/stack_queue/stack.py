class Stack:
    def __init__(self):
        self.items=[]
    
    def isEmpty(self):
        return len(self.items)==0  # Check if the stack is empty
    
    def size(self):
        return len(self.items) # return no of element in stack
    
    def peek(self):
        if(self.isEmpty()):
            return "Stack is empty"
        
        return self.items[-1]
        
    def push(self,num):
        self.items.append(num)

    def pop(self):
        if(self.isEmpty()):
            return "Stack is empty"
        else:
            return self.items.pop()
    def display(self):
        if(self.isEmpty()):
            return "Stack is Empty"
        else:
            print("Stack elements from top to bottom:")
            for item in reversed(self.items):
                print(item)
               


s=Stack()
s.push(10)
s.push(20)
s.push(30)
s.push(40)
s.display()
print("Popped element:", s.pop())
print("Top element:", s.peek())
print("Is stack empty?", s.isEmpty())
print("Stack size:", s.size())
s.display()
            