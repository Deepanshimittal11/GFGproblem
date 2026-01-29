class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        int i=0;
        while(!q.isEmpty()){
            while(i<n/2){
                q1.offer(q.poll());
                i++;
            }
            q2.offer(q.poll());
        }
        
        while(!q1.isEmpty() && !q2.isEmpty()){
            q.offer(q1.poll());
            q.offer(q2.poll());
        }
    }
}
