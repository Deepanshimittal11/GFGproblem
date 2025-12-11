class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        //n=4 (100)
        // if we do (1 << k) 0001 -> 0001 (b/c k = 0)
        if((n & (1 << k)) != 0){
            return true;
        }
        else {
            return false;
        }
    }
}