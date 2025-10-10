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
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> res = new ArrayList<>();
        pre(root, res);
        return res;
    }
    public void pre(Node node, ArrayList<Integer> res){
        if(node == null) return;
        res.add(node.data);
        pre(node.left, res);
        pre(node.right, res);
    }
}