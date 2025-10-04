class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        //this is a brute force solution 1110/1111 testcase passed.
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        long sum = 0;
        int duplicate = -1;
        int n = arr.length;
        
        for(int i = 0;i<arr.length;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
            if(mpp.get(arr[i])>1){
                duplicate = arr[i];
            }
            sum += arr[i];
        }
        
        long totalSum = (long) n*(n+1)/2;
        int missing = (int) (totalSum-(sum-duplicate));
        
        ans.add(duplicate);
        ans.add(missing);
        return ans;
        
        //optimize solution:
        
    }
}
