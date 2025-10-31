/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        dfs(root,new ArrayList<Integer>(), res);
        return res;
    }
    public static void dfs(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res){
        // ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return;
        path.add(root.data);
        
        if(root.left==null && root.right==null){
            res.add(new ArrayList<>(path));
        }else{
            dfs(root.left, path, res);
            dfs(root.right, path, res);
        }
        path.remove(path.size()-1);
    }
}




















