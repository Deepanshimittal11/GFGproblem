// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        for(int x : arr){
            if(mpp.get(x)==1) return x;
        }
        return 0;
        // int n = arr.length;
        // int[] freq = new int[arr.length];
        // for(int i=0;i<n;i++){
            
        // }
    }
}
