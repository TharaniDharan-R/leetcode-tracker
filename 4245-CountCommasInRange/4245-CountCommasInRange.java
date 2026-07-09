// Last updated: 7/9/2026, 9:45:45 AM
class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n>=1000)
            c+=n-999;
        if(n>=1000000)
            c+=n-999999;
        if(n>=1000000000)
            c+=n-999999999;
        return c;
    }
}