// Last updated: 11/14/2026, 1:15:16 AM
1
2import java.util.*;
3
4class Solution {
5    public int[] topKFrequent(int[] nums, int k) {
6
7        HashMap<Integer, Integer> hm = new HashMap<>();
8
9        // Count frequency
10        for (int i : nums) {
11            hm.put(i, hm.getOrDefault(i, 0) + 1);
12        }
13
14        // Store elements in ArrayList
15        ArrayList<Integer> list = new ArrayList<>(hm.keySet());
16
17        // Sort based on frequency (descending)
18        Collections.sort(list, (a, b) -> hm.get(b) - hm.get(a));
19
20        // Get top K elements
21        int[] ans = new int[k];
22
23        for (int i = 0; i < k; i++) {
24            ans[i] = list.get(i);
25        }
26
27        return ans;
28    }
29}
30