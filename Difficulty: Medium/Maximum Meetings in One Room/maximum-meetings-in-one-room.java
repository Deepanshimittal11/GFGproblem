class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        int[][] arr = new int[N][3];
        for(int i=0;i<N;i++){
            arr[i][0] = S[i];
            arr[i][1] = F[i];
            arr[i][2] = i+1;
        }
        
        Arrays.sort(arr, (a,b) -> {
            if(a[1]==b[1]) return a[2]-b[2];
            return a[1]-b[1];
        });
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0][2]);
        int lastfinish = arr[0][1];
        
        for(int i=1;i<N;i++){
            if(lastfinish < arr[i][0]){
                ans.add(arr[i][2]);
                lastfinish = arr[i][1];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
