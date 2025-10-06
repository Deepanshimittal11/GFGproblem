class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        // if(arr.length == 1) return 0;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x ){
                idx=i;
            }
        }
        return idx;
    }
}
