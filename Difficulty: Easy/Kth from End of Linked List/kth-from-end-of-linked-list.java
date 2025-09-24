/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if(head==null) return -1;
        
        Node temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        if(k>len) return -1;
        
        int val = len-k;
        temp = head;
        
        for(int i=0;i<val;i++){
            temp = temp.next;
        }
        return temp.data;
    }
}