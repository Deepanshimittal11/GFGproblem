class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int l = 0;
        
        for(int r=0;r<n;r++){
            if(arr[r]<0){
                q.offer(r);
            }    
            if(r-l+1==k){
                if(!q.isEmpty()){
                    ans.add(arr[q.peek()]);
                }
                else{
                    ans.add(0);
                }
                if(!q.isEmpty() && q.peek()==l){
                    q.poll();
                }
                l++;
            }
        }
        return ans;
    }
}