// Last updated: 7/15/2026, 10:25:00 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3
4        HashSet<Integer> hs = new HashSet<>();
5
6        for (int i = 0; i < nums.length; i++) {
7
8            if (hs.contains(nums[i])) {
9                return true;
10            }
11
12            hs.add(nums[i]);
13
14            if (hs.size() > k) {
15                hs.remove(nums[i - k]);
16            }
17        }
18
19        return false;
20    }
21}