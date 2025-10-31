/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null) return res;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        boolean leftToRight = true;
        
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> levellist = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                Node curr = q.poll();
                levellist.add(curr.data);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            if(!leftToRight){
                Collections.reverse(levellist);
            }
            res.addAll(levellist);
            leftToRight = !leftToRight;
        }
        return res;
    }
}