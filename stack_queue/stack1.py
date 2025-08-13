class Stack:
    def __init__(self):
        self.items=[]
    
    def is_Empty(self):
        # Check if the stack is empty
        return len(self.items)==0
    
    def size(self):
        # return no of element in stack
        return len(self.items)
    
    def peek(self):
        # display the top element of stack without removing it
        if self.is_Empty():
            return "stack is empty"
        return self.items[-1]
    
    def display(self):
        # Display the stack elements
        if self.is_Empty():
            print("Stack is empty")
        else:
            print("Stack elements from top to bottom:")
            for item in reversed(self.items):
                print(item)
    
    def push(self,num):
        self.items.append(num)

    def pop(self):
        if self.is_Empty():
            return ("stack is empty")
        return self.items.pop()

stack=Stack()
stack.push(10)
stack.push(20)
stack.push(30)
stack.push(40)
stack.display()

print("Popped element:", stack.pop())
print("Top element:", stack.peek())
print("Is stack empty?", stack.is_Empty())
print("Stack size:", stack.size())
stack.display()



