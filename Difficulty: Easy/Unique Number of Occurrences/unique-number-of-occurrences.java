
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Map<Integer, Integer> mpp = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }
        for(int val : mpp.values()){
            if(!set.add(val)){
                return false;
            }
        }
        return true;
    }
}
