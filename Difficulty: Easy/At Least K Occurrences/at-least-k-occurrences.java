class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        // Arrays.sort(arr);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
            if(mpp.get(arr[i]) == k){
                return arr[i];
            }
        }
        return -1;
    }
}