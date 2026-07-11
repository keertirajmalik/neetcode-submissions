class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = nums[0];
        int zeroIndex = -1;
        int zeroCount = 0;
        int[] res = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                zeroCount++;
                continue;
            }
            prod = prod * nums[i];
        }
        if (zeroIndex >= 0) {
            if (zeroCount == 1) {
                res[zeroIndex] = prod;
            }
            prod = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            res[i] = prod / nums[i];
        }

        return res;
    }
}
