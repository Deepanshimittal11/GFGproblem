class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num : a){
            set1.add(num);
        }
        for(int num : b){
            set1.add(num);
        }
        ans.addAll(set1);
        return ans;
    }
}