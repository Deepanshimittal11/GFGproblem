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
    static class pair{
        Node node;
        int pos;
        pair(Node node, int pos){
            this.node = node;
            this.pos = pos;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        //treemap stores unique key in sorted order 
        //so for bottom view we'll update the key value 
        //like first it'll store 1 node but when 5 comes
        //it will update the node 1 to 5.
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        
        if(root==null) return res;
        
        q.offer(new pair(root, 0));
        while(!q.isEmpty()){
            pair p = q.poll();
            Node curr = p.node;
            int num = p.pos;
            
            mpp.put(num, curr.data);
            
            if(curr.left != null) q.offer(new pair(curr.left, num-1));
            if(curr.right != null) q.offer(new pair(curr.right, num+1));
        }
        
        for(int val : mpp.values()) res.add(val);
        
        return res;
    }
}