class Geeks {
    static final int MOD = 1000000007;
    public static int commonSum(int n1, int n2, int arr1[], int arr2[]) {
        // Your code here
        long sum = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int num1 : arr1){
            set1.add(num1);
        }
        
        for(int num : arr2){
            if(set1.contains(num) && !set2.contains(num)){
                sum = (sum+num) % MOD;
                set2.add(num);
            }
        }
        
        return (int)sum;
    }
}