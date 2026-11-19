// Last updated: 11/19/2026, 6:49:22 PM
1class Solution {
2    public int minChanges(String s) {
3        int c=0;
4        for(int i=0;i<s.length();i+=2){
5            if(s.charAt(i)!=s.charAt(i+1)){
6                c++;
7            }
8        }
9        return c;
10    }
11}