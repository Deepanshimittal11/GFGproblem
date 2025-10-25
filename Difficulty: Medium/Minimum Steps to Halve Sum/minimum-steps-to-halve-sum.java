class Solution {
    public int minOperations(int[] arr) {
        // code here
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double totalsum = 0;
        
        for(int num : arr){
            pq.add((double)num);
            totalsum += num;
        }
        
        double halfval = totalsum/2.0;
        int op = 0;
        double currsum = totalsum;
        
        while(currsum > halfval){
            double val = pq.poll();
            double half = val/2.0;
            currsum -= half;
            pq.add(half);
            op++;
        }
        
        return op;
    }
}