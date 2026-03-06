class Solution {
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return isValid(0, arr, sum, 0);
    }
    
    static boolean isValid(int i, int[] arr, int sum, int target){
        if(target == sum){
            return true;
        }
        
        if(i == arr.length || target > sum){
            return false;
        }
        
        //pick
        if(isValid(i+1, arr, sum, target+arr[i])){
            return true;
        }
        
        //not pick
        return isValid(i+1, arr, sum, target);
    }
}