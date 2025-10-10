// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        int n = s.length();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        StringBuilder str = new StringBuilder();
        for(char c : set){
            str.append(c);
        }
        return str.toString();
    }
}