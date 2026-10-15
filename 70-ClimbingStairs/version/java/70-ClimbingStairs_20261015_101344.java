// Last updated: 10/15/2026, 10:13:44 AM
1class Solution {
2    public int climbStairs(int n) {
3        if(n<=2)
4        return n;
5        int first=1;
6        int second=2;
7        for(int i=3;i<=n;i++){
8            int third= first +second;
9            first= second;
10            second = third;
11        }
12        return second;
13    }
14}