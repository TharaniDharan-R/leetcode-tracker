// Last updated: 7/9/2026, 9:46:43 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0,t=0;
        for(int i=0;i<=n;i++)
        {
            if(i%m==0)
            {
                s+=i;
            }
            else{
                t+=i;
            }
           // int c=s-t;

        }
         return t-s;
    }
}