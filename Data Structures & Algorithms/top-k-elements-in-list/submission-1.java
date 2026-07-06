class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> frequency = new HashMap();
        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // I have to sort the frequencyList 
        Integer[] uniqueNums = frequency.keySet().toArray(new Integer[0]);
        for (int i = 0; i < uniqueNums.length - 1; i++) {
            for (int j = 0; j < uniqueNums.length - 1 - i; j++) {
                if (frequency.get(uniqueNums[j]) < frequency.get(uniqueNums[j + 1])) {
                    // Swap
                    int temp = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = temp;
                }
            }
        }

        // pick k most frequent number
        int[] result = new int[k];
        for(int i=0; i < k; i++){
            result[i] = uniqueNums[i];
        }    

        return result;
    }
}
