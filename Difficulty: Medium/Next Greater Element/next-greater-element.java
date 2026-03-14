class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length-1;
        
        for(int i=n;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}