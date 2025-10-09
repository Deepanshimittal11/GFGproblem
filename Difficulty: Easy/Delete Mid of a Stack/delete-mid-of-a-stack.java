class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n =s.size();
        int mid = (n+1)/2;
        int ind = n+1-mid;
        for(int i=1;i<n;i++){
            int top = s.pop();
            if(i != ind) st.push(top);
        }
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    }
}