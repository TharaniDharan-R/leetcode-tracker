// Last updated: 7/14/2026, 9:25:50 AM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st= new Stack<>();
4        Stack<Character> st1= new Stack<>();
5        for(char c:s.toCharArray()){
6            if(!st.isEmpty() && c=='#')
7            st.pop();
8            else if(c!='#')
9            st.push(c);
10        }
11         for(char c:t.toCharArray()){
12            if(!st1.isEmpty() && c=='#')
13            st1.pop();
14            else if(c!='#')
15            st1.push(c);
16        }
17        if(st.equals(st1))
18        return true;
19        return false;
20    }
21}