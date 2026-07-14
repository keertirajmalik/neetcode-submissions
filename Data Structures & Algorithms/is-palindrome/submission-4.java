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
        if ((c < (int) 'a' || c > (int) 'z') && (c < (int) 'A' || c > (int) 'Z')
            && (c < (int) '0' || c > (int) '9')) {
            return true;
        }
        return false;
    }
}
