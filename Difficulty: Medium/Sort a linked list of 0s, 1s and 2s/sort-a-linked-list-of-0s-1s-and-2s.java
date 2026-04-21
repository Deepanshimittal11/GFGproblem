/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        
        Node list0 = new Node(-1);
        Node l0 = list0;
        
        Node list1 = new Node(-1);
        Node l1 = list1;
        
        Node list2 = new Node(-1);
        Node l2 = list2;
        
        Node temp = head;
        while(temp!=null){
            if(temp.data == 0) {
                l0.next = temp;
                l0 = l0.next;
            }
            else if(temp.data == 1){
                l1.next = temp;
                l1 = l1.next;
            }
            else{
                l2.next = temp;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        l2.next = null;
        l1.next = list2.next;
        l0.next = (list1!=null) ? list1.next : list2.next;
        return list0.next;
    }
}