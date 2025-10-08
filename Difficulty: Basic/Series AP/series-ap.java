
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
        // AP:  nthterm = a1 + (n-1)*diff;
        // diff = a2-a1;
        int diff = a2-a1;
        return a1+(n-1)*diff;
    }
}
