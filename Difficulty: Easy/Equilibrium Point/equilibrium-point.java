class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int r = arr.length-1;
        int totalsum = 0;
        for(int x : arr) totalsum += x;
        
        int ls = 0;
        for(int i=0;i<r;i++){
            totalsum -= arr[i];
            if(ls == totalsum) return i;
            ls += arr[i];
        }
        return -1;
    }
}
