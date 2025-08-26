class Node_CLL
{
   public int data;
   public Node_CLL next; //its hold the address of next node
   public Node_CLL prev;
   Node_CLL(int data)
   {
     this.data=data;
     next=null;
     prev=null;
   }
}
class CLL_Creation1
{
    public Node_CLL head; //its hold the address of first node
    public Node_CLL last;
    CLL_Creation1()
    {
        head=null;
        last=null;
    }
    public void insert_at_first(int num)
    {
        Node_CLL new_node=new Node_CLL(num);
        //1.when linked list is empty
        if(head==null)
        {
            head=new_node;
            last=new_node;
        }
        //2.when linked list is not empty
        else
        {
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
            head.prev=last;
            last.next=head;
        }
        
    }
    public void insert_at_last(int num)
    {
        Node_CLL new_node=new Node_CLL(num);
        if(head==null)  //linked list is empty
        {
            head=new_node;
            last=new_node;
        }
        else if(last.next==head) //linked list has one node
        {
            head.next=new_node;
            new_node.prev=head;
            last=new_node;
            last.next=head;
            head.prev=last;
        }
        else
        {
            Node_CLL temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=new_node;
            new_node.prev=temp;
            last=new_node;
            last.next=head;
            head.prev=last;
        }
    }
    public void insert_at_anywhere(int num,int position)
    {
        Node_CLL new_node=new Node_CLL(num);
        if(head==null) //if linked list empty
        {
            head=new_node;
            last=new_node;
        }
        else
        {
           Node_CLL curr=head;
           Node_CLL p=null;
           while(curr!=null && curr.data!=position)
           {
               p=curr;
               curr=curr.next;

           }
           if(curr==null)
           {
             System.out.println("this position is not present");
             return;
           }
           else{
                new_node.next=curr;
                new_node.prev=curr.prev;
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
        else if(last.next==head)
        {
            head=null;   
            last=null;
        }
        else
        {   Node_CLL temp=head;
            head=temp.next;
            head.prev=last;
            last.next=head;
        }
    }
    public void delete_at_last()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(last.next==head)
        {
            head=null;
            last=null;
            return;
        }
        Node_CLL temp=head;
        while(temp.next.next!=head)
        {
            temp=temp.next;
        }
        last=temp;
        last.next=head;
        head.prev=last;
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
        Node_CLL current=head;
        Node_CLL p=null;
        Node_CLL forward=current.next;

        while(current!=null && current.data!=num)
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
            Node_CLL temp=head;
            while(temp!=null)
            {
                if(temp.next!=null)
                {
                    System.out.print(temp.data+"-><-");
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
public class CLL1
{
    public static void main(String args[])
    {
        CLL_Creation1 obj=new CLL_Creation1();
       
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