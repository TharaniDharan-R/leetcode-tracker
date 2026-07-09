// Last updated: 7/9/2026, 9:45:52 AM
class Solution {
    public int mirrorDistance(int n) {
        int r=0;
        int n1=n;
        while(n>0){
            int a=n%10;
            r=r*10+a;
            n=n/10;
        }
        return Math.abs(n1-r);
    }
}