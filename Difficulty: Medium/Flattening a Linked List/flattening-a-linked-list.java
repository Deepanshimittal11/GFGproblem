/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        if(root==null || root.next==null) return root;
        
        //flatten right side
        root.next = flatten(root.next);
        
        //merge them
        return flatten2lists(root, root.next);
    }
    public Node flatten2lists(Node a, Node b){
        Node dummy = new Node(-1);
        Node curr = dummy;
        
        while(a!=null && b!=null){
            if(a.data < b.data){
                curr.bottom = a;
                a = a.bottom;
            }
            else{
                curr.bottom = b;
                b = b.bottom;
            }
            curr = curr.bottom;
        }
        if(a!=null) curr.bottom = a;
        else curr.bottom = b;
        
        return dummy.bottom;
    }
}