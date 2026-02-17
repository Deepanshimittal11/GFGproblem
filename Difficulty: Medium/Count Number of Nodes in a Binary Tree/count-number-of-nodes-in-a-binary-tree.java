// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root == null) return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return 1+left+right;
    }
}