class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) {
                continue;
            }

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int threeSum = a + nums[l] + nums[r];

                if (threeSum < 0) {
                    l++;
                } else if (threeSum > 0) {
                    r--;
                } else {
                    res.add(List.of(a, nums[l], nums[r]));
                    l++;
                    while ((nums[l] == nums[l - 1]) && (l < r)) {
                        l++;
                    }
                }
            }
        }

        return res;
    }
}
