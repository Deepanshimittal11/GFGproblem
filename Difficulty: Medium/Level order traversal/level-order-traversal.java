/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                list.add(curr.data);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            ans.add(list);
        }
        return ans;
    }
}