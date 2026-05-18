// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> res = new ArrayList<>();
        helper(s, res, "");
        Collections.sort(res);
        return res;
    }
    public void helper(String s, List<String> res, String curr){
        if(s.length() == 0){
            res.add(curr);
            return;
        }
        
        char ch = s.charAt(0);
        helper(s.substring(1), res, curr+ch);
        helper(s.substring(1), res, curr+"");
    }
}