// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        Node dummy = new Node(0);
        Node curr = dummy;
        Node temp = head;
        
        int len = 1;
        if(pos == len) {
            curr.next = head.next;    
        }
        else{
            while(temp!=null){
                if(len+1 == pos){
                    temp.next = temp.next.next;
                }
                len++;
                temp = temp.next;
            }
            curr.next = head;
        }
        return dummy.next;
    }
}
