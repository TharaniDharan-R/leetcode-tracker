// Last updated: 7/9/2026, 9:51:02 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor ==-1){
            return 2147483647;
        }
        else{
        int d=dividend/divisor;
        return d;}
    }
}