/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newNode = new Node(val);
        int len = 1;
        Node temp = head;
        Node dummy = new Node(0);
        Node curr = dummy;
        if(pos==1) {
            curr.next = newNode;
            newNode.next = head;
        }
        else{
            while(temp != null){
                if(len+1 == pos){
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                // curr = curr.next;
                temp = temp.next;
                len++;
            }
            temp = head;
            curr.next = temp;
        }
        return dummy.next;
    }
}