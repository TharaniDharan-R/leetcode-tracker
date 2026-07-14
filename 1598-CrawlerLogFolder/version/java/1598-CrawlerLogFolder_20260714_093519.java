// Last updated: 7/14/2026, 9:35:19 AM
1class Solution {
2    public int minOperations(String[] logs) {
3        int c=0;
4        int n=logs.length;
5        for(int i=0;i<n;i++){
6            if(logs[i].equals("../"))
7            c--;
8            else if(logs[i].equals("./"))
9            c=c;
10            else
11            c++;
12            System.out.println(c);
13        if(c<0)
14        c=0;
15        }
16        return c;
17    }
18}