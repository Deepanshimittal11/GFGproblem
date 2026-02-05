class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n = arr.length;
        int l = 0;
        int cnt0 = 0;
        int maxlen = Integer.MIN_VALUE;
        
        for(int r=0;r<n;r++){
            if(arr[r]==0) cnt0++;
            if(cnt0 > k){
                if(arr[l]==0) cnt0--;
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}