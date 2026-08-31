// Last updated: 8/31/2026, 11:20:18 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        if (s.length() < k) {
4            return 0;
5        }
6
7        int[] freq = new int[26];
8
9        for (char c : s.toCharArray()) {
10            freq[c - 'a']++;
11        }
12
13        for (int i = 0; i < s.length(); i++) {
14            if (freq[s.charAt(i) - 'a'] < k) {
15
16                int left = longestSubstring(s.substring(0, i), k);
17                int right = longestSubstring(s.substring(i + 1), k);
18
19                return Math.max(left, right);
20            }
21        }
22
23        return s.length();
24    }
25}