class Solution {
    boolean isPalindrome(String s) {
        // code here
        int n = s.length();        
        int l=0;
        int r = n-1;
        
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        
        return true;
    }
}