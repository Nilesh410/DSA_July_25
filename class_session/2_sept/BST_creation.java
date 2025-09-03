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
public class BST_creation
{
    public static void main(String args[])
    {
        Node_Tree root=null;
        root=insert(root,12);
        root=insert(root,8);
        root=insert(root,25);
        root=insert(root,4);
        root=insert(root,18);
        root=insert(root,32);
        root=insert(root,10);
        //display the elements
        inorder(root);
        System.out.println("\nele is present:="+search(root,25));

    }
    public static Node_Tree insert(Node_Tree root, int value)
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

    public static Node_Tree search(Node_Tree root,int key_ele)
    {
        if(root==null || root.data==key_ele)
            return root;
        if(root.data>key_ele)
            return search(root.left,key_ele);
        else 
           return search(root.right,key_ele);
    }
}
