class Node
{
   public int data;
   public Node next; //its hold the address of next node
   Node(int data)
   {
     this.data=data;
     next=null;
   }
}
class LL_Creation1
{
    public Node head; //its hold the address of first node
    LL_Creation1()
    {
        head=null;
    }
    public void insert_at_first(int num)
    {
        Node new_node=new Node(num);
        //1.when linked list is empty
        if(head==null)
        {
            head=new_node;
        }
        //2.when linked list is not empty
        else
        {
            new_node.next=head;
            head=new_node;
        }
        
    }
    public void insert_at_last(int num)
    {
        Node new_node=new Node(num);
        if(head==null)  //linked list is empty
        {
            head=new_node;
        }
        else if(head.next==null) //linked list has one node
        {
            head.next=new_node;
        }
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
    public void insert_at_anywhere(int num,int position)
    {
        Node new_node=new Node(num);
        if(head==null) //if linked list empty
        {
            head=new_node;
        }
        else
        {
           Node temp=head;
           while(temp!=null && temp.data!=position)
           {
               temp=temp.next;
           }
           if(temp==null)
           {
             System.out.println("this positin is not present");
             return;
           }
           else{
              new_node.next=temp.next;
              temp.next=new_node;
           }
        }
    }
    public void delete_at_first()
    {
        if (head==null)
        {
            System.out.println("Linked list is empty");
        
        }
        else if(head.next==null)
        {
            head=null;
            
        }
        else
        { 
            head=head.next;
        }
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
        else
        {
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
            System.out.println("");
        }
       
    }
}
public class Linked_List1
{
    public static void main(String args[])
    {
        LL_Creation1 obj=new LL_Creation1();
       
        obj.insert_at_first(33);
        obj.insert_at_first(24);
        obj.insert_at_first(34);
        obj.display();
        obj.insert_at_last(54);
        obj.display();
        obj.insert_at_anywhere(72,24);
        obj.display();
        obj.delete_at_first();
        obj.display();
        obj.delete_at_last();
        obj.delete_at_value(72);
        obj.delete_at_value(24);
    }
}