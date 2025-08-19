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
    }
}