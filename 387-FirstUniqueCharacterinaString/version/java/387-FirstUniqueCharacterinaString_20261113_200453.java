// Last updated: 11/13/2026, 8:04:53 PM
1import java.util.*;
2
3class Solution {
4    public int firstUniqChar(String s) {
5
6        HashMap<Character, Integer> hm = new HashMap<>();
7
8        // Count frequency
9        for (int i = 0; i < s.length(); i++) {
10            char c = s.charAt(i);
11
12            hm.put(c, hm.getOrDefault(c, 0) + 1);
13        }
14
15        // Find first unique character
16        for (int i = 0; i < s.length(); i++) {
17
18            char c = s.charAt(i);
19
20            if (hm.get(c) == 1) {
21                return i;
22            }
23        }
24
25        return -1;
26    }
27}