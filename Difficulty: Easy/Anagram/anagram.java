class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        Map<Character, Integer> mpp1 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            mpp1.put(ch1, mpp1.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch2 = s2.charAt(i);
            if(!mpp1.containsKey(ch2)){
                return false;
            }
            mpp1.put(ch2, mpp1.get(ch2)-1);
            if(mpp1.containsKey(ch2)){
                if(mpp1.get(ch2)==0) mpp1.remove(ch2);
            }
        }
        return mpp1.isEmpty();
    }
}