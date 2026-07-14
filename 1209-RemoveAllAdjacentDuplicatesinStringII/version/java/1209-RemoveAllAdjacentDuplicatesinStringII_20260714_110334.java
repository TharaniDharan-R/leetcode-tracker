// Last updated: 7/14/2026, 11:03:34 AM
1class pair{
2          char ch;
3          int count;
4          pair(char ch, int count){
5            this.ch=ch;
6            this.count =count;
7          }
8
9        }
10    class Solution {
11    public String removeDuplicates(String s, int k) {
12        Stack<pair> st = new Stack<>();
13        for(char c: s.toCharArray()){
14            if(st.isEmpty()){
15                st.push(new pair(c,1));
16            }
17            else if(st.peek().ch==c){
18                st.peek().count++;
19             if(st.peek().count==k){
20                st.pop();
21            }
22            }
23            else
24            st.push(new pair(c,1));
25        }
26       StringBuilder sb= new StringBuilder();
27       for(pair p:st){
28        for(int i=0;i<p.count;i++){
29       sb.append(p.ch);
30        }
31       
32        
33       }
34       return sb.toString();
35       
36    }
37}