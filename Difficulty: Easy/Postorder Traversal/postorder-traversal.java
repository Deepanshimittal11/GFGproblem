/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    public void helper(Node root, ArrayList<Integer> res){
        if(root == null) return;
        helper(root.left, res);
        helper(root.right, res);
        res.add(root.data);
    }
}