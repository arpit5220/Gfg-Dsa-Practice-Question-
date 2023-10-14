class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
	    ArrayList<Integer>ls=new ArrayList<>();
       helper(root,low,ls,high);
       return ls;
    }
    public static void helper(Node root,int lo,ArrayList<Integer>ls,int hi){
        if(root==null)
        return;
        helper(root.left,lo,ls,hi);
        if(root.data<=hi && root.data>=lo)
        ls.add(root.data);
        helper(root.right,lo,ls,hi);
    }
    
}
