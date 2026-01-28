class Solution {
    public int countSubset(int[] arr, int k) {
        // code here
        int n = arr.length;
        int mid = n / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        List<Integer> leftSums = new ArrayList<>();
        List<Integer> rightSums = new ArrayList<>();

        generate(left, 0, 0, leftSums);
        generate(right, 0, 0, rightSums);

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int s : rightSums) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        int count = 0;
        for (int s : leftSums) {
            count += freq.getOrDefault(k - s, 0);
        }

        return count;
    }
    void generate(int[] arr, int idx, int sum, List<Integer> list) {
        if (idx == arr.length) {
            list.add(sum);
            return;
        }
        generate(arr, idx + 1, sum, list);             // exclude
        generate(arr, idx + 1, sum + arr[idx], list);  // include
    }
}
