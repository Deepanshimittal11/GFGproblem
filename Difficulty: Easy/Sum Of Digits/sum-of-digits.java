class Solution {
    static int sumOfDigits(int n) {
        // code here
        if(n>=0 && n<10) return n;
        
        int sum = 0;
        
        while(n>0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
