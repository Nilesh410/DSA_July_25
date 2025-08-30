class Node
{
   public int data;
   public Node next; //its hold the address of next node
   public Node prev;
   Node(int data)
   {
     this.data=data;
     next=null;
     prev=null;
   }
}
class DLL_Creation1
{
    public Node head; //its hold the address of first node
    DLL_Creation1()
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
            head.prev=new_node;
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
            new_node.prev=head;
        }
        else  //multiple node in the linked list
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;
            new_node.prev=temp;
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
           Node p=null;
           Node curr=head;
           while(curr!=null && curr.data!=position)
           {
               p=curr;
               curr=curr.next;
           }
           if(curr==null)
           {
             System.out.println("this positin is not present");
             return;
           }
           else{
               new_node.next=curr;
               new_node.prev=p;
               p.next=new_node;
               curr.prev=new_node;
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
            head.prev=null;
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
            head.prev=null;
            display();
            return;
        }
        Node current=head;
        Node p=null;
        Node forward=head.next;
        while(current!=null&&current.data!=num)
        {
            p=current;
            current=current.next;
            forward=forward.next;
        }
        if(current==null)
        {
            System.out.println("value is not present in linked list");
            return;
        }
        p.next=current.next;
        forward.prev=p;
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
                    System.out.print(temp.data+"<->");
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
public class dll1
{
    public static void main(String args[])
    {
        DLL_Creation1 obj=new DLL_Creation1();
       
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