class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int[] row : points){
            int dis = (row[0])*(row[0]) + (row[1])*(row[1]);
            pq.offer(new int[]{dis, row[0], row[1]});
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(k-- > 0 && !pq.isEmpty()){
            int[] curr = pq.poll();
            ans.add(new ArrayList<>(Arrays.asList(curr[1], curr[2])));
        }
        return ans;
    }
}