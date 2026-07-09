// Last updated: 7/9/2026, 9:47:11 AM
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
            //System.out.print(i);
            c++;
        }
        return c;
    }
}