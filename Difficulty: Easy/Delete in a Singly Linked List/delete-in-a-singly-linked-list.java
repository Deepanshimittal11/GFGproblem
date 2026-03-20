/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        Node dummy = new Node(0);
        Node curr = dummy;
        int cnt = 1;
        
        while(temp!=null){
            if(cnt == x){
                temp = temp.next;
                cnt++;
                continue;
            }
            curr.next = new Node(temp.data);
            curr = curr.next;
            temp = temp.next;
            cnt++;
        }
        return dummy.next;
    }
}