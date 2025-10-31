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
class Solution {
    static class pair{
        Node node;
        int pos;
        pair(Node node, int pos){
            this.node = node;
            this.pos = pos;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root==null) return res;
        
        Queue<pair> q = new LinkedList<>();
        Map<Integer, Integer> mpp = new TreeMap<>();
        
        q.offer(new pair(root,0));
        
        while(!q.isEmpty()){
            pair p = q.poll();
            Node curr = p.node;
            int num = p.pos;
            if(!mpp.containsKey(num)){
                mpp.put(num, curr.data);
            }
            if(curr.left != null) q.offer(new pair(curr.left, num-1));
            if(curr.right != null) q.offer(new pair(curr.right, num+1));
        }
        for(int val : mpp.values()) res.add(val);
        return res;
    }
}








