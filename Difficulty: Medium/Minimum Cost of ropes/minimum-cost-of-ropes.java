class Solution {
    public static int minCost(int[] arr) {
        // code here
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        int cost = 0;
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            sum = a+b;
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
}