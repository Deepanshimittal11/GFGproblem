class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        // if(k>=n) reverse(arr, 0, n-1);
        //[1,2,3,4,5,6,7,8] , k=3
        // reverse = [1,2,3], [4,5,6] & [7,8]
        for(int i=0;i<n;i+=k){
            int left = i;
            int right = Math.min(i+k-1, n-1);
            reverse(arr, left, right);
        }
    }
    public void reverse(int[] arr,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}