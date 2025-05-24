// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        int n = a.length;
        int m = b.length;
        if(n!= m) return false;
        HashMap<Integer,Integer> Amap = new HashMap<>();
        HashMap<Integer,Integer> Bmap = new HashMap<>();
        for(int i : a){
            Amap.put(i, Amap.getOrDefault(i,0)+1);
        }
        for(int j : b){
            Bmap.put(j, Bmap.getOrDefault(j,0)+1);
        }
        return Amap.equals(Bmap);
    }
}