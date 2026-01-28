class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
            q.offer(ch);
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }
            if(q.isEmpty()) str.append('#');
            else str.append(q.peek());
        }
        return str.toString();
    }
}