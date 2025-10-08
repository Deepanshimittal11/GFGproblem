class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        int maxlen = 0;
        int sum = 0;
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum==0) maxlen=i+1;
            if(mpp.containsKey(sum)){
                maxlen = Math.max(maxlen, i-mpp.get(sum));
            }else{
                mpp.put(sum, i);
            }
        }
        return maxlen;
    }
}