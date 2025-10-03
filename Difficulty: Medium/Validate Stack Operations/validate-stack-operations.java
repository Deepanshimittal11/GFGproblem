class Solution {
    public boolean validateOp(int[] a, int[] b) {
        // code here
        Stack<Integer> st = new Stack<>();
        int i=0, j=0;
        while(i<a.length || !st.isEmpty()){
            while(!st.isEmpty() && st.peek()==b[j]){
                st.pop();
                j++;
            }
            if(i < a.length){
                st.push(a[i]);
                i++;
            }
            else{
                break;
            }
        }
        return st.isEmpty() ? true : false;
    }
}