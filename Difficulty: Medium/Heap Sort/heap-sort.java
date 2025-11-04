class Solution {
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : arr){
            pq.add(val);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = pq.poll();
        }
    }
}