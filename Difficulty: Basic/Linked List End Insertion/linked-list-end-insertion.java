/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node dummy = new Node(0);
        Node temp = dummy;
        Node curr = head;
        Node ans = new Node(x);
        
        if(head==null) return ans;
        while(curr!=null){
            temp.next = curr;
            curr = curr.next;
            temp = temp.next;
        }
        temp.next = new Node(x);
        temp = temp.next;
        temp.next = null;
        return dummy.next;
    }
}