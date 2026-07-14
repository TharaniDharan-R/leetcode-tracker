// Last updated: 7/14/2026, 12:01:41 PM
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        char c[]=s.toCharArray();
4        for(int i=0;i<c.length-1;i++){
5            if(Math.abs(c[i]-c[i+1])>2)
6            return false;
7            
8        }
9        return true;
10    }
11}