// Last updated: 8/4/2026, 11:57:15 AM
1class Solution {
2    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
3        int min = Integer.MAX_VALUE;
4        int n = nums.size();
5        for (int i = 0; i < n; i++) {
6            int sum = 0;
7            for (int j = i; j < n; j++) {
8                sum += nums.get(j);
9                int len = j - i + 1;
10                if (len >= l && len <= r) {
11                    if (sum > 0) {
12                        min = Math.min(min, sum);
13                    }
14                }
15                if (len > r) {
16                    break;
17                }
18            }
19        }
20        return (min == Integer.MAX_VALUE) ? -1 : min;
21    }
22}