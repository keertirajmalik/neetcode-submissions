class Solution {
    public void sortColors(int[] nums) {
        int color = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = index; j < nums.length; j++) {
                if (nums[j] == color) {
                    int value = nums[index];
                    nums[index] = nums[j];
                    nums[j] = value;
                    index++;
                }
            }
            color++;
        }
    }
}