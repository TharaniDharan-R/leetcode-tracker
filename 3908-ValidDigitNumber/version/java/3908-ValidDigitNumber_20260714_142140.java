// Last updated: 7/14/2026, 2:21:40 PM
1class Solution {
2    public boolean validDigit(int n, int x) {
3        String s=String.valueOf(n);
4        char [] c=s.toCharArray();
5        char ch=(char)(x+'0');
6        if(c[0]==ch)
7        return false;
8        for(int i=1;i<c.length;i++){
9            if(c[i]==ch){
10            return true;
11            }
12            
13        }
14       // System.out.print(q);
15        return false;
16    }
17}