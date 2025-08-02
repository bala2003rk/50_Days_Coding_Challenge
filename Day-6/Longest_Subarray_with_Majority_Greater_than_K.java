class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int[] transformed = new int[n];
        
        for (int i = 0; i < n; i++) {
            transformed[i] = arr[i] > k ? 1 : -1;
        }

        Map<Integer, Integer> prefixIndex = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += transformed[i];

            if (sum > 0) {
                maxLen = i + 1;
            } else {
                if (prefixIndex.containsKey(sum - 1)) {
                    maxLen = Math.max(maxLen, i - prefixIndex.get(sum - 1));
                }
            }

            prefixIndex.putIfAbsent(sum, i);
        }

        return maxLen;
    }
}
