// User function Template for Java
import java.util.Arrays;
class Solution {
    public long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here
        Collections.sort(arr1);
        Collections.sort(arr2, Collections.reverseOrder());
        int n = arr1.size();
        long sum = 0;
        
        for(int i=0;i<n;i++){
            sum += (long)arr1.get(i)*arr2.get(i);
        }
        return sum;
    }
}