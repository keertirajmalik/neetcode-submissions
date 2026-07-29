class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0;
        Map<Character, Integer> unique = new LinkedHashMap();
        for (int r = 0; r < s.length(); r++) {
            while (unique.containsKey(s.charAt(r))) {
                unique.remove(s.charAt(l));
                l++;
            }
            unique.put(s.charAt(r), 1);
            maxLen = Math.max(maxLen, unique.size());
        }
        return maxLen;
    }
}
