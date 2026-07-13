class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        int longest = 0;

        for (int num : nums) {
            arr.add(num);
        }

        for (int num : arr) {
            if (!arr.contains(num - 1)) {
                int length = 0;
                while (arr.contains(num + length)) {
                    length += 1;
                }
                longest = length > longest ? length : longest;
            }
        }

        return longest;
    }
}
