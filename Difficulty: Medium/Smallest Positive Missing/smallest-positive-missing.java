class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n = arr.length;
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<n;i++){
            set2.add(arr[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set2.contains(i)) return i;
        }
        return n+1;
    }
}
