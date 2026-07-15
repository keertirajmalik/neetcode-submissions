class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, mid = r / 2;
        int res = nums[mid];
        while (l <= r) {
            if (nums[r] > nums[l]) {
                res = Math.min(res, nums[l]);
                break;
            }
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            res = Math.min(res, nums[mid]);
            mid = (r + l) / 2;
        }
        return res;
    }
}
