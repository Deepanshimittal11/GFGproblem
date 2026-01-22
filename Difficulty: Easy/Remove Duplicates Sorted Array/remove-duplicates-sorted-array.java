class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++) set.add(arr[i]);
        
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                ans.add(arr[i]);
                set.remove(arr[i]);
            }
        }
        return ans;
    }
}
