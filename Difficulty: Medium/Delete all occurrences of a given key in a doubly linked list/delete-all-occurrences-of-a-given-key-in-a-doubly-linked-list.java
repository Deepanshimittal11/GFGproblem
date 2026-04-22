/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node dummy = new Node();
        dummy.data = -1;
        
        Node curr = dummy;
        Node temp = head;
        
        while(temp!=null){
            if(temp.data!=x){
                curr.next = temp;
                temp.prev = curr;
                curr = curr.next;
            }
            temp = temp.next;
        }
        
        curr.next = null;
        if(dummy.next!=null){
            dummy.next.prev = null;
        }
        return dummy.next;
    }
}