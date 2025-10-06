class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        List<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        
        for(int i=0;i<temp.size();i++){
            arr[i] = temp.get(i);
        }
        
        for(int i = temp.size();i<n;i++){
            arr[i] = 0;
        }
    }
}