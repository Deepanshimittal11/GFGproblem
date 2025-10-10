/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        in(root, res);
        return res;
    }
    public void in(Node node, ArrayList<Integer> res){
        if(node == null) return;
        in(node.left, res);
        res.add(node.data);
        in(node.right, res);
    }
}