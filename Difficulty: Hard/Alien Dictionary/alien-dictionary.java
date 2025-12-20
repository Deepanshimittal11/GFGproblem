class Solution {
    public String findOrder(String[] words) {
        // code here
        int n = words.length;
        
        //build graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<26;i++){
            adj.add(new ArrayList<>());
        }
        
        boolean[] present = new boolean[26];
        for(String w : words){
            for(char ch : w.toCharArray()){
                present[ch - 'a'] = true;
            }
        }
        
        //build edges
        for(int i=0;i<words.length-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            boolean found = false;
            int len = Math.min(w1.length(), w2.length());
            
            for(int j=0;j<len;j++){
                if(w1.charAt(j)!=w2.charAt(j)){
                    adj.get(w1.charAt(j) - 'a').add(w2.charAt(j) - 'a');
                    found = true;
                    break;
                }
            }
            
            if(!found && w1.length()>w2.length()){
                return "";
            }
        }
        
        //topo sort
        int[] vis = new int[26];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<26;i++){
            if(present[i] && vis[i]==0){
                if(!dfs(i, vis, adj, st)){
                    return "";
                }
            }
        }
        
        //building answer
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append((char) (st.pop() + 'a'));
        }
        return sb.toString();
    }
    public boolean dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        vis[node] = 1; //visiting
        for(int it : adj.get(node)){
            if(vis[it]==1) return false;
            if(vis[it]==0){
                if(!dfs(it, vis, adj, st)) return false;
            }
        }
        vis[node] = 2; //visited.
        st.push(node);
        return true;
    }
}










