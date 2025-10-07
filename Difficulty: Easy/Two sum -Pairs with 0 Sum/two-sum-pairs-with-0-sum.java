// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        //[-4,-1,-1,0,1,2]
        Arrays.sort(arr);
        
        //TLE
        // Set<ArrayList<Integer>> set = new HashSet<>();
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] + arr[j] == 0){
        //         ArrayList<Integer> pair = new ArrayList<>();
        //             pair.add(arr[i]);
        //             pair.add(arr[j]);
        //             set.add(pair); //do not add duplicate pair.
        //         }
        //     }
        // }
        // ans.addAll(set); // add all pair into ans.
        // //then do sorting.
        // Collections.sort(ans, (a,b) -> {
        //     if(!a.get(0).equals(b.get(0))) return a.get(0)-b.get(0);
        //     else return a.get(1)-b.get(1);
        //     }
        // );
        // return ans;
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == 0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                ans.add(pair);
                int leftval = arr[left];
                int rightval = arr[right];
                while(left<right && arr[left]==leftval) left++;
                while(left<right && arr[right]==rightval) right--;
            }
            else if(sum < 0){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
