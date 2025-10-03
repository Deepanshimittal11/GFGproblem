class Solution {
    public boolean has132Pattern(int[] arr) {
        // code here
        int n = arr.length;
        if(n<3) return false;
        
        int[] min = new int[n];
        min[0] = arr[0];
        
        for(int i=1;i<n;i++){
            min[i] = Math.min(min[i-1], arr[i]);
        }
        
        Stack<Integer> st = new Stack<>();
        for(int j=n-1;j>=0;j--){
            if(arr[j]>min[j]){
                while(!st.isEmpty() && st.peek()<=min[j]){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()<arr[j]){
                    return true;
                }
                st.push(arr[j]);
            }
        }
        return false;
    }
}