class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        while(k-->0 && !st.isEmpty()){
            st.pop();
        }
        
        if(st.isEmpty()) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(char ch : st) sb.append(ch);
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()==0) return "0";
        
        return sb.toString();
    }
}