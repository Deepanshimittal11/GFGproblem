// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        int n = arr1.size();
        int m = arr2.size();
        int p = arr3.size();
        
        List<Integer> ans = new ArrayList<>();

        int i=0, j=0, k=0;
        while(i<n && j<m && k<p){
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);
            
            if(a==b && b==c){
                ans.add(arr1.get(i));
                
                while(i<n && arr1.get(i)==a) i++;
                while(j<m && arr2.get(j)==b) j++;
                while(k<p && arr3.get(k)==c) k++;
            }
            else if(a<b) i++;
            else if(b<c) j++;
            else k++;
        }
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
}