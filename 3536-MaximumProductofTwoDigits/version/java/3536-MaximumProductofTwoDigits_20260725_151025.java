// Last updated: 7/25/2026, 3:10:25 PM
1class Solution {
2    public int maxProduct(int n) {
3      String s=String.valueOf(n);
4      char ch[]=s.toCharArray();
5      int a[]=new int[s.length()];
6      for(int i=0;i<ch.length;i++){
7        a[i]=ch[i]-'0';
8      }
9      Arrays.sort(a);
10      return a[a.length-2]*a[a.length-1];
11     // return 1;
12
13    }
14}