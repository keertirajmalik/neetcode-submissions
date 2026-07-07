class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }
            count = nums[i] == res ? count + 1 : count - 1;
        }
        return res;
    }
}