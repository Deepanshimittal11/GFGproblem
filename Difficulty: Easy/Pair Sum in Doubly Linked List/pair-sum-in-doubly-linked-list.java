/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        //It will give TLE
        // Node temp = head;
        // while(temp!=null){
        //     int x = target - temp.data;
        //     Node curr = temp.next;
        //     while(curr!=null){
        //         if(curr.data == x){
        //             ArrayList<Integer> list = new ArrayList<>(2);
        //             list.add(temp.data);
        //             list.add(curr.data);
        //             ans.add(list);
        //         }
        //         curr = curr.next;
        //     }
        //     temp = temp.next;
        // }
        // return ans;
        
        
        // optimize approch
        if(head==null || head.next==null) return null;
        
        Node left = head, right = head;
        while(right.next!=null){
            right = right.next;
        }
        
        while(left!=null && right!=null && left!=right && right.next!=left){
            int sum = (left.data + right.data);
            
            if(sum == target){
                ArrayList<Integer> list = new ArrayList<>(2);
                list.add(left.data);
                list.add(right.data);
                ans.add(list);
                
                left = left.next;
                right = right.prev;
            }
            else if(sum > target){
                right = right.prev;
            }
            else{
                left = left.next;
            }
        }
        return ans;
    }
}