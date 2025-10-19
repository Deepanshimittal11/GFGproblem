/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        return helper(root, 0, 100000000) ? true : false;
    }
    public boolean helper(Node root, int mini, int maxi){
        if(root == null) return true;
        if(root.data >= maxi || root.data < mini) return false;
        return (helper(root.left, mini, root.data) && helper(root.right, root.data, maxi));
    }
}