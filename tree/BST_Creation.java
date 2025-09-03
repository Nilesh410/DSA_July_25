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
public class BST_Creation
{
    public static void main(String args[])
    {
       Node_Tree root=null;
       root= insert(root,12);
       root=insert(root,8);
       root=insert(root,25);
       root=insert(root,4);
       root=insert(root,10);
       root=insert(root,18);
       root=insert(root,32);
       inorder(root);

    }
    public static Node_Tree insert(Node_Tree root,int value)
    {
        if(root==null)
            return new Node_Tree(value);
        if(root.data<value)
             root.right=insert(root.right,value); 
        if(root.data>value)
            root.left=insert(root.left,value);
        return root;
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
}