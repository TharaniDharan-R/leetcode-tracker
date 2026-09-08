// Last updated: 9/8/2026, 9:22:24 AM
1class Solution {
2    public int countCommas(int n) {
3        int c=0;
4        if(n>=1000)
5            c+=n-999;
6        if(n>=1000000)
7            c+=n-999999;
8        if(n>=1000000000)
9            c+=n-999999999;
10        return c;
11    }
12}