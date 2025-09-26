/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
        // code here
        //let list is 2->5->6
        if(del_node==null || del_node.next==null) return;
        //del_node = 2
        //nexti = 5
        Node nexti = del_node.next;
        //5->5->6
        del_node.data = nexti.data;
        //5->6
        del_node.next = nexti.next;
        nexti.next = null;
    }
}