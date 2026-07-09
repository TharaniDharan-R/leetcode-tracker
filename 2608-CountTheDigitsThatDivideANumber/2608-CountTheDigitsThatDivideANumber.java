// Last updated: 7/9/2026, 9:47:02 AM
class Solution {
    public int countDigits(int num) {
        int a=0,c=0,temp=num;
        while(num>0)
        {
            a=num%10;
            if(temp%a==0){
                c++;
            }
            num/=10;


        }
        return c;
    }
}