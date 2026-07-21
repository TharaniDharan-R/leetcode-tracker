// Last updated: 7/22/2026, 1:21:22 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> hs= new HashSet<>();
4        int st=0;
5        int n=0;
6        for(int i=0;i<s.length();i++){
7            char c=s.charAt(i);
8            while(hs.contains(c)){
9                hs.remove(s.charAt(st));
10                st++;
11            }
12            hs.add(c);
13            if(hs.size()>n)
14            n=hs.size();
15        }
16        return n;
17    }
18}