// Last updated: 7/29/2026, 2:52:34 PM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if (s == 0) 
4        {
5            return 0;
6        }
7        if (s > 9 * n)
8        {
9            return -1;
10        }
11
12        StringBuilder ans = new StringBuilder();
13
14        while (n > 0) 
15        {
16            int digit = Math.min(9, s);
17            ans.append(digit);
18            s -= digit;
19            n--;
20        }
21
22        return Integer.parseInt(ans.toString());
23    }
24}