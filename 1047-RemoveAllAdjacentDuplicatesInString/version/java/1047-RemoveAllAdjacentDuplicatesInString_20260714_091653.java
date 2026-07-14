// Last updated: 7/14/2026, 9:16:53 AM
1class Solution {
2    public String removeStars(String s) {
3        Stack<Character> st = new Stack<>();
4        for(char c :s.toCharArray()){
5            if(!st.isEmpty() && c=='*'){
6                st.pop();
7            }
8            else
9            st.push(c);
10        }
11        StringBuilder sb= new StringBuilder();
12        for( char c:st)
13        sb.append(c);
14        return sb.toString();
15    }
16}