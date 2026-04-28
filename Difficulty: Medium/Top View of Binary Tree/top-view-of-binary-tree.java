/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Tuple{
    Node node;
    int row;
    public Tuple(Node node, int row){
        this.node = node;
        this.row = row;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        TreeMap<Integer, Integer> mpp = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0));
        
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            Node node = tuple.node;
            int x = tuple.row;

            if(!mpp.containsKey(x)){
                mpp.put(x, node.data);
            }

            if(node.left != null) q.offer(new Tuple(node.left, x-1));
            if(node.right != null) q.offer(new Tuple(node.right, x+1));
        }
        
        for(int val : mpp.values()){
            ans.add(val);
        }
        return ans;
    }
}