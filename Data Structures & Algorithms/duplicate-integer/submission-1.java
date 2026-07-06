class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> countMap = new HashMap();

        for (int num : nums){
            if (countMap.containsKey(num) == true) {
                return true;
            }
            countMap.put(num,true);
        }

    return false;
    }
}