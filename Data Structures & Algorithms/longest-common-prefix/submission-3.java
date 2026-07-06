class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sol = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char match = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() <= i || match !=strs[j].charAt(i)) {
                    return sol;
                }
            }
            sol = sol + match;
        }

        return sol;
    }
}