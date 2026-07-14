class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (inValidChar(left)) {
                l++;
                continue;
            }
            if (inValidChar(right)) {
                r--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean inValidChar(int c) {
        if ((c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c > 57)) {
            return true;
        }
        return false;
    }
}
