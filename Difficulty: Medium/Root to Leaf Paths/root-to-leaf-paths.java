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
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, list, ans);
        return ans;
    }
    public static void helper(Node root, List<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(root == null) return;
        
        list.add(root.data);
        
        if(root.left==null && root.right==null) ans.add(new ArrayList<>(list));
        else{
            helper(root.left, list, ans);
            helper(root.right, list,ans);
        }
        
        list.remove(list.size()-1);
    }
}