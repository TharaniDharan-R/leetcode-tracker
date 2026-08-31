// Last updated: 8/31/2026, 4:05:12 PM
1class Solution {
2    public int trailingZeroes(int n) {
3        int count = 0;
4
5        while (n > 0) {
6            n = n / 5;
7            count += n;
8        }
9
10        return count;
11    }
12}