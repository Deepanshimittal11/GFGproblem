class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        long currSum = 0, bestSum = -1;
        int currStart = 0;
        int bestStart = -1, bestEnd = -1;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                currSum += arr[i];
            }
            else{
                if(currStart<i && currSum>bestSum ||
                    (currSum==bestSum && (i-currStart>bestEnd-bestStart+1))){
                        bestSum = currSum;
                        bestStart = currStart;
                        bestEnd = i-1;
                }
                currSum = 0;
                currStart = i+1; //we skip the negative element through this.
            }
        }
        if(currStart<n && currSum>bestSum || (currSum==bestSum && n-currStart>bestEnd-bestStart+1)){
            bestSum = currSum;
            bestStart = currStart;
            bestEnd = n-1;
        }
        if(bestStart == -1){
            ans.add(-1); //we did not recieve any positive element in an array.
            return ans;
        }
        for(int i=bestStart;i<=bestEnd;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}





