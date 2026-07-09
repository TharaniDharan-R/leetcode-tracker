// Last updated: 7/9/2026, 9:51:10 AM
class Solution 
{
    public boolean isValid(String s) 
    {
       Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> bracketMap = new java.util.HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        for (char c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (bracketMap.get(c) != topElement) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}