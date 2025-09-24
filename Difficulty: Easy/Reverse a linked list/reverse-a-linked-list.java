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
    Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(!st.isEmpty()){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }
}