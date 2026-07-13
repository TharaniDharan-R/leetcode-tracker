// Last updated: 7/13/2026, 9:27:09 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int digitsum=0;
4        int squaresum=0;
5        while(n>0){
6            int digit = n%10;
7            digitsum+=digit;
8            squaresum+=digit*digit;
9            n/=10;
10        }
11        if(squaresum-digitsum>=50)
12        return true;
13        return false;
14    }
15}