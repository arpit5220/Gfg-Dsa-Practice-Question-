
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;
import java.math.*;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Solution
{
    //Function to find the nodes that are common in both BST.
    static ArrayList<Integer>ls;
    static HashSet<Integer>hs;
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
      hs=new HashSet<>();
       ls=new ArrayList<>();
       preorder(root1);
       preorder(root2);
     Collections.sort(ls);
     return ls;
    }
    public static  void preorder(Node root){
        if(root==null)
        return ;
        if(hs.contains(root.data))
        ls.add(root.data);
        else
        hs.add(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
