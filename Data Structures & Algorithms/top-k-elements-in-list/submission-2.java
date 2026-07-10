class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies (HashMap makes this easy again)
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 2. Figure out exactly how many items will go into each bucket
        // This allows us to size our 2D array rows perfectly without wasting memory.
        int[] bucketSizes = new int[nums.length + 1];
        for (int frequency : count.values()) {
            bucketSizes[frequency]++;
        }

        // 3. Initialize the 2D array buckets
        int[][] freq = new int[nums.length + 1][];
        for (int i = 0; i < freq.length; i++) {
            if (bucketSizes[i] > 0) {
                freq[i] = new int[bucketSizes[i]]; // Create a perfectly sized row
            }
        }

        // 4. Fill the 2D array
        // We need an array to track the current insertion index for each bucket row
        int[] bucketIndex = new int[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            // Put the number in its frequency bucket, then increment the index for that bucket
            freq[frequency][bucketIndex[frequency]++] = num;
        }

        // 5. Gather the top k elements by iterating backwards through frequencies
        int[] res = new int[k];
        int resIdx = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] != null) {
                for (int n : freq[i]) {
                    res[resIdx++] = n;
                    if (resIdx == k) {
                        return res;
                    }
                }
            }
        }

        return res;
    }
}