// Last updated: 10/4/2026, 12:20:15 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        char c[]=s.toCharArray();
4        int n=c.length;
5        int minopen =0;
6        int maxopen=0;
7        for(int i=0;i<n;i++){
8            if(c[i]=='('){
9                minopen++;
10                maxopen++;
11            }
12            if(c[i]==')'){
13                minopen--;
14                maxopen --;
15            }
16            if(c[i]=='*'){
17                minopen--;
18                maxopen++;
19            }
20            if(maxopen <0){
21                return false;
22            }
23            if(minopen < 0){
24                minopen =0;
25            }
26        }
27        return minopen==0;
28    }
29}