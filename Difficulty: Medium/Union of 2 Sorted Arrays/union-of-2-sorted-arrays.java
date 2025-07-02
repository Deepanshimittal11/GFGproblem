// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer> set = new TreeSet<>();
        for(int num : a){
            set.add(num);
        }
        for(int num : b){
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
