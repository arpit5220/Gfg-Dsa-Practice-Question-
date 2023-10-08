class Solution {
    Node sortedInsert(Node head, int val) {
        
        Node newNode=new Node(val);
        if(head.data>=val){
            newNode.next=head;
            return newNode;
        }
        
        Node prev=head;
        Node curr=head.next;
        
        while(curr!=null){
            if(curr.data>=val){
                newNode.next=curr;
                prev.next=newNode;
                return head;
            }
            prev=curr;
            curr=curr.next;
        }
        prev.next=newNode;
        return head;
    }
}
