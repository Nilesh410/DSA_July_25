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
            head.next=head;
            head.prev=head;
        }
        //2.when linked list is not empty
        else
        {
            new_node.next = head;
            new_node.prev = last;
            head.prev = new_node;
            last.next = new_node;
            head = new_node;
        }
        
    }
    public void insert_at_last(int num)
    {
        Node_CLL new_node=new Node_CLL(num);
        if(head==null)  //linked list is empty
        {
            head=new_node;
            last=new_node;
            head.next = head;
            head.prev = head;
        }
        
        else
        {
            new_node.prev = last;
            new_node.next = head;
            last.next = new_node;
            head.prev = new_node;
            last = new_node;
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
    public void delete_at_value(int num) {
    if (head == null) {
        System.out.println("Linked list is empty");
        return;
    }

    Node_CLL current = head;

    // Traverse until we either find the value or come back to head
    do {
        if (current.data == num) {
            if (current == head && current == last) { // only one node
                head = null;
                last = null;
            } else if (current == head) {  // delete head
                head = head.next;
                head.prev = last;
                last.next = head;
            } else if (current == last) {  // delete last
                last = last.prev;
                last.next = head;
                head.prev = last;
            } else {  // delete in between
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            return;
        }
        current = current.next;
    } while (current != head);

    System.out.println("Value " + num + " not found");
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
          do {
                System.out.print(temp.data);
                temp = temp.next;
                if (temp != head) {
                System.out.print(" <-> ");
                }
            } while (temp != head);
             System.out.println();
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
    
        obj.delete_at_value(72);
        obj.delete_at_value(24);
    }
}