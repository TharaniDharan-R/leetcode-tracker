// Last updated: 7/15/2026, 8:22:20 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long l=0;
4        long r=(long)Math.sqrt(c);
5        while(l<=r){
6            long sum= l*l+r*r;
7            if(sum==c)
8            return true;
9            if(sum<c)
10            l++;
11            else
12            r--;
13        }
14        return false;
15    }
16}