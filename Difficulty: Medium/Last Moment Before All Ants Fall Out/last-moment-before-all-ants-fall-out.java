class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int maxtime = 0;
        for(int pos : left){
            maxtime = Math.max(maxtime, pos);
        }
        for(int pos : right){
            maxtime = Math.max(maxtime, n-pos);
        }
        return maxtime;
    }
}