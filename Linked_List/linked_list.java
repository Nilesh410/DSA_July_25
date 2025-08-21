class Node
{
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LL_Creation 
{
    public Node head;
    public LL_Creation()
    {
        head=null;
    }
    public void insert_at_first(int value)
    {
        Node temp=new Node(value);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }
    public void insert_at_last(int value)
    {
        Node new_node=new Node(value);
        if(head==null)
            head=new_node;
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            
            temp.next=new_node;
        }
    }
    public void insert_middle(int value,int position)
    {
        Node current=head;
        Node prev=head;
        while(current.data!=position&&current!=null)
        {
            prev=current;
            current=current.next;
        }
            Node new_node=new Node(value);
            new_node.next=current;
            prev.next=new_node;  
    }
    public void delete_at_first()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        head=head.next;
        display();
    }
    public void delete_at_last()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        display();
    }
    public void delete_at_value(int num)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(head.data==num)
        {
            head=head.next;
            display();
            return;
        }
        Node current=head;
        Node prev=null;
        while(current.data!=num&&current!=null)
        {
            prev=current;
            current=current.next;
        }
        if(current==null)
        {
            System.out.println("value is not present in linked list");
            return;
        }
        prev.next=current.next;
        display();
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Linked list empty");
        }
        else{
           Node temp=head;
           while(temp!=null)
           {
              if(temp.next!=null)
              {
                System.out.print(temp.data+"->");
                temp=temp.next;
              }
              else
              {
                System.out.print(temp.data);
                temp=temp.next;
              } 
           } 
        }
        System.out.println("");
    }
    public void search(int key)
    {
        if(head==null)
            System.out.println("linked list is empty");
        else
        {
            Node temp=head;
            while(temp!=null && temp.data!=key)
            {
                temp=temp.next;
            }
            if(temp==null)
                System.out.println("Element is not present");
            else
            {
                System.out.print("Element is present");
            }
        }
    }
}
public class linked_list
{
    public static void main(String args[])
    {
        LL_Creation obj=new LL_Creation();
        obj.insert_at_first(10);
        obj.insert_at_first(20);
        obj.insert_at_last(25);
        obj.insert_at_first(30);
        obj.insert_middle(32,25);
        obj.display();
        obj.delete_at_first();
        obj.delete_at_last();
        obj.delete_at_value(20);
        obj.search(25);
    }
}