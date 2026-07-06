class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap();

        for(String s: strs) {
            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[(int) c - (int)'a'] += 1;
            }
            String countString = Arrays.toString(count);
            List<String> existingString = result.get(countString);
            if (existingString == null){
                existingString = new ArrayList();
            }
            existingString.add(s);
            result.put(countString, existingString);
        }

        return result.values().stream().collect(Collectors.toList());
    }
}
