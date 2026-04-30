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
}
*/
class Solution {
    public int minValue(Node root) {
        // code here
        if(root==null) return 0;
        if(root.left != null){
            return minValue(root.left);
        }
        return root.data;
    }
}