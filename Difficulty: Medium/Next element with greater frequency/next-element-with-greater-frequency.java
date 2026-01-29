class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && mpp.get(st.peek()) <= mpp.get(arr[i])) st.pop();
            
            if(st.isEmpty()) ans.add(-1);
            else{
                ans.add(st.peek());
                
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}