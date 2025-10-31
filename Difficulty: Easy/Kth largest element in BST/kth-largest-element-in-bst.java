/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    int cnt = 0;
    int ans = -1;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        if(root==null) return 0;
        kthLargest(root.right, k);
        cnt++;
        if(cnt==k){
            ans = root.data;
            return ans;
        }
        kthLargest(root.left, k);
        return ans;
    }
}