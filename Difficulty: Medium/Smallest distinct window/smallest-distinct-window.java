// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        
        HashMap<Character, Integer> mpp = new HashMap<>();
        int l=0;
        int minlen = Integer.MAX_VALUE;
        int cnt = 0;
        int n = str.length();
        
        int distinct = set.size();
        
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
            
            if(mpp.get(ch)==1) cnt++;
            
            while(cnt == distinct){
                minlen = Math.min(minlen, i-l+1);
                char c = str.charAt(l);
                mpp.put(c, mpp.get(c)-1);
                if(mpp.get(c)==0) cnt--;
                l++;
            }
        }
        return minlen;
    }
}