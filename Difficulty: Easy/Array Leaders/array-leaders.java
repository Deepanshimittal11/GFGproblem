class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()<=arr[i]){
                st.push(arr[i]);
            }
            if(st.isEmpty()) st.push(arr[i]);
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
}
