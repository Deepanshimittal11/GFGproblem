class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        for(int num : arr){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }
        for(int key : mpp.keySet()){
            if(mpp.containsKey(target)){
                return mpp.get(target);
            }
        }
        return 0;
    }
}
