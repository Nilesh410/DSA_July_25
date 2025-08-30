import java.util.*;
class Node_Tree
{
    public int data;
    public Node_Tree left;
    public Node_Tree right;
    public Node_Tree(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class Tree_Creation
{
    public static void main(String args[])
    {
          Node_Tree root=new Node_Tree(12);
          root.left=new Node_Tree(15);
          root.right=new Node_Tree(17);
          root.right.left=new Node_Tree(24);
           System.out.println("Traversing in Tree");
          System.out.println("Preorder:-");
          preorder(root);
          System.out.println("\n"+"Inorder:-");
          inorder(root);
          System.out.println("\n"+"Postorder:-");
          postorder(root); 
          System.out.println("\n"+"levelorder:-");
          levelorder(root); 
    }
    public static void preorder(Node_Tree root)
    {
        if(root!=null)
        {
            System.out.print(root.data+"->");
            preorder(root.left);
            preorder(root.right);
        }
    }
     public static void inorder(Node_Tree root)
    {
      
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+"->");
            inorder(root.right);
        }
       
    }
     public static void postorder(Node_Tree root)
    {   
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"->");
        }
    }

    public static void levelorder(Node_Tree root)
    {
        if(root==null)
            return;
        
        Queue<Node_Tree> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int level_size=q.size();

            for(int i=0;i<level_size;i++)
            {
                Node_Tree temp=q.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                   q.add(temp.left);
                if(temp.right!=null)
                   q.add(temp.right);
            }
            System.out.println("");
        }
    }
}