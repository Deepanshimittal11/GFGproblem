class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int l=0;
        int n = s.length();
        int maxlen = -1;
        Map<Character, Integer> mpp = new HashMap<>();
        
        for(int i=0;i<n;i++){
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i),0)+1);
            while(mpp.size()>k){
                mpp.put(s.charAt(l), mpp.get(s.charAt(l))-1);
                if(mpp.get(s.charAt(l))==0) mpp.remove(s.charAt(l));
                l++;
            }
            if(mpp.size()==k) maxlen = Math.max(maxlen, i-l+1);
        }
        return maxlen;
    }
}