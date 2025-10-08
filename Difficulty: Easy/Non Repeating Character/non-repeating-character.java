class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        char[] freq = new char[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : s.toCharArray()){
             if(freq[ch-'a'] == 1) return ch;
        }
        return '$';
    }
}
