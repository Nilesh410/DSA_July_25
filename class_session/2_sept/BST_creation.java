
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
        //search
        System.out.println("\nele is present:="+search(root,25));
        //valid BST or not
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println("is it valid bst="+isValid(root,min,max));

        //min value of BST
        System.out.println("min ele of BST="+min(root));
        //max value of BST
        System.out.println("max ele of BST="+max(root));

        //Predecessor and successor 
        System.out.println("Predecessor of BST="+predecessor(root));
        System.out.println("Successor of BST="+successor(root));
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

    public static boolean isValid(Node_Tree root,int min, int max)
    {
        if(root==null)
            return true;
        if(root.data<min || root.data>max)
            return false;
        return isValid(root.left,min,root.data)&&isValid(root.right,root.data,max);
    }

    public static int min(Node_Tree root)
    {
        Node_Tree temp=root;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp.data;
    }
     public static int max(Node_Tree root)
    {
        Node_Tree temp=root;
        while(temp.right!=null)
        {
            temp=temp.right;
        }
        return temp.data;
    }

    public static int predecessor(Node_Tree root)
    {
        return max(root.left);
    }

    public static int successor(Node_Tree root)
    {
        return min(root.right);
    }
}
