class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        
        for(int num : arr){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            if(entry.getValue()>1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}