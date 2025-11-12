class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        int[][] arr = new int[n][2];
        
        for(int i=0;i<n;i++){
            arr[i][0] = val[i];
            arr[i][1] = wt[i];
        }
        
        //sort using ratio of val/wt. 
        Arrays.sort(arr, (a,b) -> Double.compare((double)b[0]/b[1] , (double)a[0]/a[1]));
        
        double sum = 0;
        int i=0;
        while(capacity>0 && i<n){
            int v = arr[i][0];
            int w = arr[i][1];
            if(w<=capacity){
                sum += v;
                capacity -= w;
            }
            else{
                sum += (double)v/w*capacity;
                capacity = 0;
            }
            i++;
        }
        return sum;
    }
}