import java.util.Scanner;
class Queue_Implementation
{
    private int arr[]=new int[5];
    private int front,rear;

    public Queue_Implementation()
    {
        front=-1;
        rear=-1;
    }
     public void enqueue(int num)
    {
        if(isFull()==true)
        {
            System.out.println("Queue is full");
        }
        else if(isEmpty())
        {
            front=rear=0;
            arr[rear]=num;
        }
        else
        {
            rear=(rear+1)%arr.length;
            arr[rear]=num;
        }
    }
    public void dequeue()
    {
        if(isEmpty()==true)
            System.out.println("Queue is empty");
        else if(front==rear)
        {
            //only one element
            System.out.println("Dequeue element="+arr[front]);
            front=rear=-1;
        }
        else 
        {
            System.out.println("Dequeue element="+arr[front]);
            front=(front+1)%arr.length;     
        }
    }
    public boolean isFull()
    {
        if(front==(rear+1)%arr.length)
            return true;
        else 
            return false;
    }
    public boolean isEmpty()
    {
        if(front==-1&&rear==-1)
            return true;
        else
            return false;
    }
    public int peek()
    {
        if(rear==-1)
          {  System.out.println("Stack is empty");
            return -1;}
        else
            return arr[front];
    }
    public void display()
    {
        if(isEmpty()==true)
            System.out.println("Queue is empty");
        else
            {
                int i = front;
                while (true) {
                    System.out.print(arr[i] + " ");
                    if (i == rear) break;  // stop after printing last element
                    i = (i + 1) % arr.length;
                }
            }
    }
}
public class circular_queue
{
    public static void main(String args[])
    {
        Queue_Implementation q=new Queue_Implementation();
        Scanner sc=new Scanner(System.in);
        int ch,choice;
        do
        {
            System.out.println("****************");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("Select the queue operation:-");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the element=");
                        int data=sc.nextInt();
                        q.enqueue(data);
                        break;
                case 2:q.dequeue();
                        break;
                case 3: System.out.println("Peek element="+q.peek());
                        break;
                case 4:q.display();
                        break;
                default:System.out.println("Select proper operation");
            }
            System.out.println("Press 1 for continue otherwise press 0");
            ch=sc.nextInt();
        }while(ch!=0);
    }
}