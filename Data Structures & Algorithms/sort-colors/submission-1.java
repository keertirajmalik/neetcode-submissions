class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                l += 1;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r -= 1;
                i -= 1;
            }
            i += 1;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int val = nums[i];
        nums[i] = nums[j];
        nums[j] = val;
    }
}