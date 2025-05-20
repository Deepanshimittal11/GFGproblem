/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node temp = head;
        int cnt = 1;
        while(temp!=null && temp.next!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}