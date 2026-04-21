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
    public Node addOne(Node head) {
        // code here.
        //sbse phle reverse the list
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node next1 = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next1;
        }
        
        Node curr = prev;
        int carry = 1;
        while(curr!=null){
            int sum = curr.data + carry;
            curr.data = sum%10;
            carry = sum/10;
            
            if(carry==0) break;
            if(curr.next==null && carry==1){
                curr.next = new Node(1);
                break;
            }
            curr = curr.next;
        }
        
        temp = prev;
        prev = null;
        while(temp!=null){
            Node next1 = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next1;
        }
        return prev;
    }
}