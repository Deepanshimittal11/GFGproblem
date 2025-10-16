/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class Solution {
    public Node moveZeroes(Node head) {
        // Your Code here.
        if(head == null) return null;
        
        Node dummy0 = new Node(-1);
        Node curr0 = dummy0;
        Node dummy1 = new Node(-1);
        Node curr1 = dummy1;
        
        Node temp = head;
        
        while(temp!=null){
            if(temp.data == 0){
                curr0.next = new Node(temp.data);
                curr0 = curr0.next;
            }else{
                curr1.next = new Node(temp.data);
                curr1 = curr1.next;
            }
            temp = temp.next;
        }
        curr1.next = null;
        curr0.next = dummy1.next;
        return dummy0.next;
    }
}