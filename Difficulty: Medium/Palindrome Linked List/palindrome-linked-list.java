/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        if(head==null || head.next==null) return true;
        Node temp = head;
        
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }
        
        Node dummy = new Node(0);
        Node curr = dummy;
        while(!st.isEmpty()){
            curr.next = new Node(st.pop());
            curr = curr.next;
        }
        
        temp = head;
        curr = dummy.next;
        
        while(curr!=null && temp!=null){
            if(curr.data!=temp.data){
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }
        return true;
    }
}











