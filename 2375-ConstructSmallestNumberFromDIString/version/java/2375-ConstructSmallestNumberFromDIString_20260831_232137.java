// Last updated: 8/31/2026, 11:21:37 PM
1class Solution {
2    public String smallestNumber(String pattern) {
3
4        StringBuilder ans = new StringBuilder();
5        Stack<Integer> stack = new Stack<>();
6
7        for (int i = 0; i <= pattern.length(); i++) {
8
9            stack.push(i + 1);
10
11            if (i == pattern.length() || pattern.charAt(i) == 'I') {
12
13                while (!stack.isEmpty()) {
14                    ans.append(stack.pop());
15                }
16            }
17        }
18
19        return ans.toString();
20    }
21}