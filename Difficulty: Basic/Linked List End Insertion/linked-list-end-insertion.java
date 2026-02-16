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
        Node temp = head;
        Node curr = new Node(x);
        if(head == null) return curr;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = curr;
        temp = temp.next;
        temp.next = null;
        return head;
    }
}