// Last updated: 10/6/2026, 11:20:27 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3       Stack<Character>st= new Stack<>();
4        for(char c:s.toCharArray()){
5           if (!(st.isEmpty()) && c==')' && st.peek()=='('){
6                st.pop();
7           }
8           else{
9            st.add(c);
10           }
11        }
12        return st.size();
13    }
14}