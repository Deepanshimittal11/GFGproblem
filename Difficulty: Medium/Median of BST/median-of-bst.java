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
    ArrayList<Integer> ans = new ArrayList<>();
    public int findMedian(Node root) {
        // Code here
        inorder(root);
        int n = ans.size();
        if(n % 2 == 0) return ans.get((n/2)-1);
        else return ans.get(n/2);
    }
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        ans.add(root.data);
        inorder(root.right);
    }
}