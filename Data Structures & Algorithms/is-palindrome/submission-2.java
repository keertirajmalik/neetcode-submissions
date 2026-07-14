class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            System.out.println(Character.toLowerCase(left) + " " + Character.toLowerCase(right));
            if (((int) left < 65 || (int) left > 90) && ((int) left < 97 || (int) left > 122)
                && ((int) left < 48 || (int) left > 57)) {
                l++;
                continue;
            }
            if (((int) right < 65 || (int) right > 90) && ((int) right < 97 || (int) right > 122)
                && ((int) right < 48 || (int) right > 57)) {
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
}
