/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        
        Node lastElem = temp;
        temp = head;
        
        while(temp!=lastElem && temp.prev!=lastElem){
            int val = temp.data;
            temp.data = lastElem.data;
            lastElem.data = val;
            
            temp = temp.next;
            lastElem = lastElem.prev;
        }
        return head;
    }
}