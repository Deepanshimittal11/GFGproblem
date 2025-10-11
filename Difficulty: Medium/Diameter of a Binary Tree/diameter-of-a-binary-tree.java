/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int diameter = 0;
    public int diameter(Node root) {
        // code here
        height(root);
        return diameter;
    }
    public int height(Node root){
        if(root == null) return -1;
        
        int leftnode = height(root.left);
        int rightnode = height(root.right);
        
        int dia = leftnode+rightnode+2;
        diameter = Math.max(diameter, dia);
        return 1+Math.max(leftnode, rightnode);
    }
}