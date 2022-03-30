package tree;
import java.util.*;
//then be create only 
public class treefullcd 
{
    static Scanner sc=null;
    public static void main(String args[])
    {
        sc=new Scanner(System.in);
        node root= createtree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
    static node createtree()
    {
        node root =null;
        System.out.println("Enter the data");
        int data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        root=new node(data);
        System.out.println("enter the left side data"+data);
        root.left=createtree();
        System.out.print("enter tha  right value"+data);
        root.righ=createtree();
        return root;
    }
    static void preOrder(node root)
    {
        if(root==null)return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.righ);
    }
    static void inOrder(node root)
    {
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.righ);
    }
    static void postOrder(node root)
    {
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.righ);
        System.out.print(root.data);
    }
}
class node
{
    node righ,left;
    int data;
    node(int data)
    {
        this.data=data;

    }
}     