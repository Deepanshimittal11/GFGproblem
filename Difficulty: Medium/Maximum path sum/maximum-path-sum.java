/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int sum = Integer.MIN_VALUE;
    
    int findMaxSum(Node root) {
        // code here
        helper(root);
        return sum;
    }
    
    public int helper(Node root){
        if(root == null) return 0;
        
        int leftnode = helper(root.left);
        leftnode = Math.max(0, leftnode);
        
        int rightnode = helper(root.right);
        rightnode = Math.max(0, rightnode);
        
        int pathsum = leftnode+rightnode+root.data;
        
        
        sum = Math.max(sum, pathsum);
        
        return Math.max(leftnode, rightnode)+root.data;
    }
}