// Last updated: 7/14/2026, 9:10:07 AM
1class Solution {
2    public int minimizedStringLength(String s) {
3        HashSet<Character> hs = new HashSet<>();
4        for(char c:s.toCharArray()){
5            hs.add(c);
6        }
7        return hs.size();
8    }
9}