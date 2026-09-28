// Last updated: 9/28/2026, 9:46:38 PM
1class Solution {
2    public int maxDepth(String s) {
3        int co=0;
4        int max=0;
5        char c[]=s.toCharArray();
6        for(int i=0;i<s.length();i++){
7            if(c[i]=='(')
8            co++;
9            max=Math.max(co,max);
10            if(c[i]==')'){
11                co--;
12            }
13        }
14        return max;
15    }
16}