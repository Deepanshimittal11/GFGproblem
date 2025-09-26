/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        Node temp = head;
        while(temp!=null){
            set.add(temp.data);
            temp = temp.next;
        }
        Node dummy = new Node(-1);
        Node curr = dummy;
        temp = head;
        while(temp!=null && set.size()!=0){
            if(set.contains(temp.data)){
                curr.next = new Node(temp.data);
                curr = curr.next;
                set.remove(temp.data);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}