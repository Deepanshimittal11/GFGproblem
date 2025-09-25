import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        
        if(ans.size()<2) return -1;
        return ans.get(ans.size()-2);
    }
}