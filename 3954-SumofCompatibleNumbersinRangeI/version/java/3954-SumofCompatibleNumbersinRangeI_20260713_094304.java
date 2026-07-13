// Last updated: 7/13/2026, 9:43:04 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3       int s=0;
4       for(int i=1;i<=n+k;i++){
5        if((n&i)==0 && Math.abs(n-i)<=k){
6            s+=i;
7            System.out.print(i);
8        }
9       }
10       return s ; 
11    }
12}