class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        for(int i=0;i<n1;i++){
            pq.offer(new int[]{arr1[i]+arr2[0], i, 0});
        }
        
        while(k-->0 &&!pq.isEmpty()){
            int[] curr = pq.poll();
            int i = curr[1], j = curr[2];
            
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(arr1[i]);
            pair.add(arr2[j]);
            res.add(pair);
            
            if(j+1<n2){
                pq.offer(new int[]{arr1[i]+arr2[j+1], i, j+1});
            }
        }
        return res;
    }
}
