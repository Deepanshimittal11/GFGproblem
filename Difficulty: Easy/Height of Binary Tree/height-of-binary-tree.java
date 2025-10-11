/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root == null) return -1;
        int leftnode = height(root.left);
        int rightnode = height(root.right);
        return 1+Math.max(leftnode, rightnode);
    }
}