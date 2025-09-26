/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        if(head==null || head.next==null || k<=0) return head;
        
        int cnt = 0;
        Node temp = head;
        Node dummy = new Node(-1);
        Node curri = dummy;
        Stack<Node> st = new Stack<>();
        
        
        while(temp!=null && cnt<k){
            st.push(temp);
            temp = temp.next;
            cnt++;
        }
        
        while(!st.isEmpty()){
            curri.next =st.pop();
            curri = curri.next;
        }
        cnt=0;
        while(temp!=null){
            st.push(temp);
            temp = temp.next;
            cnt++;
        }
        while(!st.isEmpty()){
            curri.next = st.pop();
            curri = curri.next;
        }
        curri.next = null;
        return dummy.next;
    }
}
