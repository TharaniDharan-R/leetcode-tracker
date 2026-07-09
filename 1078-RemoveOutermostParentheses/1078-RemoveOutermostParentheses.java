// Last updated: 7/9/2026, 9:48:46 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
                if (balance > 1) {
                    result.append(c);
                }
            } else if (c == ')') {
                if (balance > 1) {
                    result.append(c);
                }
                balance--;
            }
        }

        return result.toString();
    }
}