/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
        if(root == null) return true;
        Queue<Node> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            Node leftval = q.poll();
            Node rightval = q.poll();
            if(leftval == null && rightval == null) continue;
            if(leftval == null || rightval == null) return false;
            if(leftval.data != rightval.data) return false;
            q.offer(leftval.left);
            q.offer(rightval.right);
            q.offer(leftval.right);
            q.offer(rightval.left);
        }
        return true;
    }
}