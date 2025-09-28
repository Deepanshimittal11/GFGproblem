class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if(ch==')' && st.pop()!='(' ||
                    ch=='}'&& st.pop()!='{' ||
                    ch==']' && st.pop()!='['){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
