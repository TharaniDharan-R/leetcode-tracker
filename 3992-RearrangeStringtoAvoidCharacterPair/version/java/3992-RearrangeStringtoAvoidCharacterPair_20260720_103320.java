// Last updated: 7/20/2026, 10:33:20 AM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        String ans="";
4        String occ="";
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)==x)
7            occ+=s.charAt(i);
8            else
9            ans+=s.charAt(i);
10        }
11        ans+=occ;
12        return ans;
13    }
14}