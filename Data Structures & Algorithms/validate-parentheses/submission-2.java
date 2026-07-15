class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{')
                    || (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
