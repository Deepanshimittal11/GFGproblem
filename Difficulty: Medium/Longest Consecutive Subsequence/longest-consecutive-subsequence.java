class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        int maxcnt = 0;
        
        int n = arr.length;
        for(int i : set){
            if(!set.contains(i-1)){
                int cnt = i;
                int len = 1;
                while(set.contains(cnt+1)){
                    cnt++;
                    len++;
                }
                maxcnt = Math.max(maxcnt, len);
            }
        }
        return maxcnt;
    }
}