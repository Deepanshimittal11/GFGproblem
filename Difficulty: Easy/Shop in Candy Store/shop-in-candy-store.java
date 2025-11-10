class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        ArrayList<Integer> ans = new ArrayList<>();
        
        int sumMin = 0;
        int i=0, j=prices.length-1;
        
        while(i<=j){
            sumMin += prices[i];
            i++;
            j -= k;
        }
        ans.add(sumMin);
        
        int sumMax = 0;
        i=0;
        j=prices.length-1;
        while(i<=j){
            sumMax += prices[j];
            j--;
            i += k;
        }
        ans.add(sumMax);
        
        return ans;
    }
}
