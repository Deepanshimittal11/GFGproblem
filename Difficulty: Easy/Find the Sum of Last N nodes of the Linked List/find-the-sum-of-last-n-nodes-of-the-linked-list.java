/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node temp = head;
        int cnt = 0;
        int totalSum = 0;
        while(temp!=null){
            totalSum += temp.data;
            temp = temp.next;
            cnt++;
        }
        temp = head;
        int diff = cnt-n;
        int count= 0;
        int sum =0;
        while(temp!=null){
            sum += temp.data;
            count++;
            temp = temp.next;
            if(count==diff){
                break;
            }
        }
        if(diff==0) return totalSum;
        return (totalSum-sum);
    }
}