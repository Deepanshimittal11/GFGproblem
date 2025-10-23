class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(k-- > 0 && !pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }
}
