
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        long sum = 0;
        int left = 0;
        int right = 0;
        
        while(right < n){
            sum += arr[right];
            while(sum > target && left < right){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            }
            right++;
        }
        ans.add(-1);
        return ans; 
    }
}
