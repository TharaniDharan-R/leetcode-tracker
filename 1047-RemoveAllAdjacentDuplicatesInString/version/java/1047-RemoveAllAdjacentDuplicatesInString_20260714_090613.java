// Last updated: 7/14/2026, 9:06:13 AM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st = new Stack<>();
4       /// String ans="";
5        // for( char c: s.toCharArray()){
6        //     st.push(c);
7        //     if(st.peek()==c){
8        //         st.pop();
9        //     }
10       // st.push(s.charAt(0));
11        for(int i=0;i<s.length();i++){
12            char c=s.charAt(i);
13            if(!st.isEmpty() && st.peek()==c)
14            st.pop();
15            else
16            st.push(c);
17        }
18            
19            
20        StringBuilder sb= new StringBuilder();
21        for(char c:st)
22        sb.append(c);
23        
24        return sb.toString();
25        }
26    }
27