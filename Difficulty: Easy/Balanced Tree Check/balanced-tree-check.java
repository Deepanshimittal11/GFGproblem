/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return helper(root) != -1;
    }
    public int helper(Node root){
        if(root == null) return 0;
        
        int leftnode = helper(root.left);
        if(leftnode == -1) return -1;
        
        int rightnode = helper(root.right);
        if(rightnode == -1) return -1;
        
        if(Math.abs(leftnode-rightnode) > 1) return -1;
        
        return Math.max(leftnode,rightnode)+1;
    }
}