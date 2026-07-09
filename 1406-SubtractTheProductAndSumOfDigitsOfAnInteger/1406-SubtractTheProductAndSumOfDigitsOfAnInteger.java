// Last updated: 7/9/2026, 9:48:37 AM
class Solution {
    public int subtractProductAndSum(int n) {
       // int sum=0;
          int p=1;
          int s=0;
        while(n>=1)
        {
            s+=n%10;
            p*=n%10;
            n/=10;
            
        }
        return p-s;       
    }
}