class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character, Integer> mpp = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }
        
        for(int i=0;i<n;i++){
            if(mpp.get(s.charAt(i))==1) return s.charAt(i);
        }
        return '$';
    }
}
