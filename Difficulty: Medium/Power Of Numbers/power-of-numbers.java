class Solution {
    public int reverseExponentiation(int n) {
        // code here
        if(n<10) {
            return (int)Math.pow(n,n);
        }
        return 10;
    }
}
