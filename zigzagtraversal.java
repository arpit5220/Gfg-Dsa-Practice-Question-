

ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer>res=new ArrayList<>();
	    Queue<Node>q=new LinkedList<>();
	    boolean ctr=true;
	    q.add(root);
	    while(!q.isEmpty()){
	        int sz=q.size();
	         ArrayList<Integer>ls=new ArrayList<>();
	        for(int i=0;i<sz;i++){
	        Node temp=q.remove();
	        if(temp.left!=null)
	        q.add(temp.left);
	        if(temp.right!=null)
	        q.add(temp.right);
	       if(ctr)
	       ls.add(temp.data);
	        else
	        ls.add(0,temp.data);
	        }
	        ctr=!ctr;
	        res.addAll(ls);
	    }
	    return res;
	}
}
