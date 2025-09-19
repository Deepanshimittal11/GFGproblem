class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=2*n-1;i>=0;i--){
            int index = i%n;
            while(!st.isEmpty() && st.peek()<=arr[index]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()) ans.add(-1);
                else{
                    ans.add(st.peek());
                }
            }
            st.push(arr[index]);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}