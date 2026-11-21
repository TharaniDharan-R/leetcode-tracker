// Last updated: 11/21/2026, 9:59:07 AM
1class Solution {
2    public String digitSum(String s, int k) {
3        StringBuilder c=new StringBuilder(s);
4        while(c.length()>k){
5            StringBuilder next=new StringBuilder(); 
6            int c1=0;
7            int sum=0;
8            for(int i=0;i<c.length();i++){
9                if(c1==k){
10                    next.append(sum);
11
12                    sum=0;
13                    c1=0;
14                }
15            int n=c.charAt(i)-'0';
16            sum+=n;
17            c1++;
18            }
19            if(c1>0){
20                next.append(sum);
21            }
22            c.setLength(0);
23            c.append(next);
24
25        }
26        return c.toString();
27    }
28}