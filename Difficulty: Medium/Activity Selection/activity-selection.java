class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        int[][] activity = new int[n][2];
        
        //stores all pair in activity.
        // testcase 1 : {{1,2},{3,4},{0,6},{5,7},{8,9},{5,9}}
        //testcase 3: {{1,2},{3,4},{2,3},{5,6}}
        for(int i=0;i<n;i++){
            activity[i][0] = start[i];
            activity[i][1] = finish[i];
        }
        
        //sort the finish in activity array
        // testcase 1 is already sorted.
        //testcase 3 : {{1,2},{2,3},{3,4},{5,6}}
        Arrays.sort(activity, (a,b) -> Integer.compare(a[1],b[1]));
        
        int cnt = 1;
        //lastfinish is:
        //testcase 1: 2
        //testcase 3: 2
        int lastfinish = activity[0][1];
        
        for(int i=1;i<n;i++){
            if(activity[i][0]>lastfinish){
                cnt++;
                lastfinish = activity[i][1];
            }
        }
        
        return cnt;
    }
}
