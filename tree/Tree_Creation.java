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

    public void preorder(Node_Tree root)
    {
        
        if(root!=null)
        {
            System.out.print(root.data+"->");
            preorder(root.left);
            preorder(root.right);
        }
    }
     public void inorder(Node_Tree root)
    {
      
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+"->");
            inorder(root.right);
        }
       
    }
     public void postorder(Node_Tree root)
    {   
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"->");
        }
    }
    public void levelOrder(Node_Tree root)
    {
        if(root==null)
            return;
        Queue <Node_Tree> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++)
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
    public Node_Tree search (Node_Tree root, int key)
    {
        if(root==null || root.data==key)
            return root;
        if(root.data>key)
            return search(root.left,key);
        else
            return search(root.right,key);
    }

    public boolean isValidBST(Node_Tree root,int min,int max)
    {
        
    }
}
public class Tree_Creation
{
    public static void main(String args[])
    {
          System.out.println("Insert the ele in tree");
          Node_Tree root=new Node_Tree(12);
          root.left=new Node_Tree(8);
          root.left.left=new Node_Tree(4);
          root.left.right=new Node_Tree(10);
          root.right=new Node_Tree(25);
          root.right.left=new Node_Tree(18);
          root.right.right=new Node_Tree(32);
          System.out.println("Traversing in Tree");
          System.out.println("Preorder:-");
          root.preorder(root);
          System.out.println("\n"+"Inorder:-");
          root.inorder(root);
          System.out.println("\n"+"Postorder:-");
          root.postorder(root);   
          System.out.println("\n"+"Levelorder:-");
          root.levelOrder(root);
          Scanner sc=new Scanner (System.in);
          System.out.println("Enter the ele to search=");
          int key=sc.nextInt();
          System.out.println(root.search(root,key));
          
    }
}