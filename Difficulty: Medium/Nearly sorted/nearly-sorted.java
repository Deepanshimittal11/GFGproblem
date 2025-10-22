class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(arr[i]);
        }
        int i = 0;
        while(!pq.isEmpty() && i<n){
            arr[i] = pq.poll();
            i++;
        }
    }
}
