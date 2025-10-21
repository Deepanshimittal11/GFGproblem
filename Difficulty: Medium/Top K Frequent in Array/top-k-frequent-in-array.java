class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int a : arr){
            mpp.put(a, mpp.getOrDefault(a,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                } else {
                    return b.getKey() - a.getKey();
                }
            });
            
        pq.addAll(mpp.entrySet());
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(k-- > 0 && !pq.isEmpty()){
            ans.add(pq.poll().getKey());
        }
        
        return ans;
    }
}
