class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        //from - a
        //to - c
        //aux - b
        if(n==1){
            return 1;
        }
        // phle to hm a->b using c
        int cnt = 0;
        cnt += towerOfHanoi(n-1, from, aux, to);
        cnt++;
        //fir b->c using a
        cnt += towerOfHanoi(n-1, aux, to, from);
        return cnt;
    }
}
