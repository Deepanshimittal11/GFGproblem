class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();
        int maxlen = 0;
        int l=0;
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(mpp.containsKey(ch) && mpp.get(ch)>=l){
                l = mpp.get(ch) + 1;
            }    
            mpp.put(ch, i);
            maxlen = Math.max(maxlen, i-l+1);
        }
        return maxlen;
    }
}