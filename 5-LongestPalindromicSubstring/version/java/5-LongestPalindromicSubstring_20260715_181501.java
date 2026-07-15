// Last updated: 7/15/2026, 6:15:01 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        int max=0;
4        int ci=0;
5        String s1="#";
6        for(int i=0;i<s.length();i++)
7        {
8            s1+=s.charAt(i)+"#";
9        }
10        int p[]=new int[s1.length()];
11
12        for(int i=0;i<p.length;i++)
13        {
14            int l=i-1;
15            int r=i+1;
16            while(l>=0&&r<s1.length()&&s1.charAt(l)==s1.charAt(r))
17            {
18                p[i]++;
19                l--;
20                r++;
21            }
22            if(p[i]>max)
23            {
24                max=p[i];
25                ci=i;
26            }
27 
28        }
29        int start=(ci-max)/2;
30        return s.substring(start,start+max);
31    }
32}