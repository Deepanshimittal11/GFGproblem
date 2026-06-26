class Solution {
    String transform(String S) {
        // code here
        S = S.toLowerCase();
        StringBuilder str = new StringBuilder();
        int cnt = 1;
        for(int i=1;i<S.length();i++){
            char ch = S.charAt(i);
            char ch1 = S.charAt(i-1);
            if(ch == ch1) cnt++;
            else{
                str.append(cnt);
                str.append(ch1);
                cnt = 1;
            }
        }
        str.append(cnt);
        str.append(S.charAt(S.length()-1));
        
        return str.toString();
    }
}