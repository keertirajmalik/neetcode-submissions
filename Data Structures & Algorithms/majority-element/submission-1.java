class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap();
        int max = 0;
        int sol = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (frequency.containsKey(val)) {
                int count = frequency.get(val) + 1;
                frequency.put(val, count);

                if (count > max) {
                    max = count;
                    sol = val;
                }
            } else {
                frequency.put(val, 1);
            }
        }

        return sol;
    }
}