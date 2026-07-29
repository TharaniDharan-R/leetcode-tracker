// Last updated: 7/29/2026, 9:44:18 PM
1class Solution {
2    public static boolean palin(String s){
3        StringBuilder sb= new StringBuilder(s);
4        if(s.equals(sb.reverse().toString()))
5        return true;
6        return false;
7    }
8    public int countSubstrings(String s) {
9        int c=0;
10        int n=s.length();
11        for(int i=0;i<n;i++){
12            for(int j=i+1;j<=n;j++){
13                if(palin(s.substring(i,j))){
14                    c++;
15                }
16            }
17        }
18        return c;
19    }
20}