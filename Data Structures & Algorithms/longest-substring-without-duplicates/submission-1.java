class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0;
        Set<Character> unique = new HashSet();
        for (int r = 0; r < s.length(); r++) {
            while (unique.contains(s.charAt(r))) {
                unique.remove(s.charAt(l));
                l++;
            }
            unique.add(s.charAt(r));
            maxLen = Math.max(maxLen, unique.size());
        }
        return maxLen;
    }
}
