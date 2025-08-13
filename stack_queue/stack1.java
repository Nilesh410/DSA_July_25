import java.util.Scanner;
class Stack_Implementation
{
    private int top;
    private int arr[]=new int [10];

    public Stack_Implementation()
    {
        top=-1;
    }

    public void push(int num)
    {
        if(isFull()==true)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top]=num;
        }
    }
    public void pop()
    {
        if(isEmpty()==true)
            System.out.println("Stack is empty");
        else 
        {
            System.out.println("Pop element="+arr[top]);
            top--;
        }
    }
    public boolean isFull()
    {
        if(top==arr.length-1)
            return true;
        else 
            return false;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public int peek()
    {
        if(top==-1)
          {  System.out.println("Stack is empty");
            return -1;}
        else
            return arr[top];
    }
    public void display()
    {
        if(isEmpty()==true)
            System.out.println("Stack is empty");
        else
            {
                for(int i=top;i>=0;i--)
                {
                    System.out.print(arr[i]+" ");
                }
            }
    }
}
public class stack1
{
    public static void main(String args[])
    {
        Stack_Implementation st=new Stack_Implementation();
        Scanner sc=new Scanner(System.in);
        int ch,choice;
        do
        {
            System.out.println("****************");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("Select the stack operation:-");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the element=");
                        int data=sc.nextInt();
                        st.push(data);
                        break;
                case 2:st.pop();
                        break;
                case 3: System.out.println("Peek element="+st.peek());
                        break;
                case 4:st.display();
                        break;
                default:System.out.println("Select proper operation");
            }
            System.out.println("Press 1 for continue otherwise press 0");
            ch=sc.nextInt();
        }while(ch!=0);
    }
}