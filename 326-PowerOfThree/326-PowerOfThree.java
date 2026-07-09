// Last updated: 7/9/2026, 9:49:41 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        // for(int i=0;i<n;i++)
        // {
        //     if(Math.pow(3,i)==n)
        //     return true;
        // }
        // return false;
        return n>0 &&1162261467%n==0;
    }
}