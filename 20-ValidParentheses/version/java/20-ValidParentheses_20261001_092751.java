// Last updated: 10/1/2026, 9:27:51 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st= new Stack<>();
4        for(char c:s.toCharArray()){
5            if(c=='(' || c=='{'|| c=='['){
6                st.push(c);
7            }
8            if(c==')'||c=='}'||c==']'){
9                if(st.isEmpty())
10                return false;
11                char curr = st.pop();
12                if(curr=='(' && c!=')' || curr=='{' && c!='}'|| curr=='[' && c!=']'){
13                    return false;
14                }
15            }
16        }
17            return st.isEmpty();
18    }
19}