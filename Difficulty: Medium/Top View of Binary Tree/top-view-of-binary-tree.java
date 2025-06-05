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
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        if(root==null) return null;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Integer> hds = new LinkedList<>();
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        hds.add(0);
        while(!nodes.isEmpty()){
            Node current = nodes.remove();
            int hd = hds.remove();
            
            if(!map.containsKey(hd)){
                map.put(hd, current.data);
            }
            if(current.left!=null){
                nodes.add(current.left);
                hds.add(hd-1);
            }
            if(current.right!=null){
                nodes.add(current.right);
                hds.add(hd+1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int val : map.values()){
            result.add(val);
        }
        return result;
    }
}