// Last updated: 8/31/2026, 11:22:52 PM
1class Solution {
2    public int[] diStringMatch(String s) {
3        int n = s.length();
4
5        int[] ans = new int[n + 1];
6
7        int low = 0;
8        int high = n;
9
10        for (int i = 0; i < n; i++) {
11
12            if (s.charAt(i) == 'I') {
13                ans[i] = low;
14                low++;
15            } else {
16                ans[i] = high;
17                high--;
18            }
19        }
20
21        ans[n] = low;
22
23        return ans;
24    }
25}
26