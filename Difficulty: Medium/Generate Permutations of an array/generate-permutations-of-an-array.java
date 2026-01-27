class Solution {
    static ArrayList<ArrayList<Integer>> ans;
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        int n = arr.length;
        ans = new ArrayList<>();
        generate(0, arr, n);
        return ans;
    }
    public static void generate(int ind, int[] arr, int n){
        ArrayList<Integer> temp = new ArrayList<>();
        
        if(ind==n){
            for(int x : arr) temp.add(x);
            ans.add(temp);
            return;
        }
        
        for(int i=ind;i<n;i++){
            swap(ind, arr, i);
            generate(ind+1, arr, n);
            swap(ind, arr, i);
        }
    }
    public static void swap(int i, int[] arr, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
};