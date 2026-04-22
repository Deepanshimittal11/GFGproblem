/*
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        Node dummy = new Node(-1);
        // dummy.data = -1;
        Node curr = dummy;
        
        Node temp = head;
        while(temp!=null){
            if(temp.data != curr.data){
                curr.next = temp;
                temp.prev = curr;
                curr = curr.next;
            }
            temp = temp.next;
        }
        
        curr.next = null;
        if(dummy.next!=null) dummy.next.prev = null;
        
        return dummy.next;
    }
}











