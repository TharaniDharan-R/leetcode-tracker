// Last updated: 7/9/2026, 9:47:14 AM
class Solution {
    public int smallestEvenMultiple(int n) {
       if(n%2==0)
       {
        n*=1;
       }
       else{
        n=n*2;
       }
       return n;
    }
}