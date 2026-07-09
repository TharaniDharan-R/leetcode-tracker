// Last updated: 7/9/2026, 9:46:32 AM
class Solution {
public:
    int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0,a=x;
        while(x>0)
        {
            s+=x%10;
            x=x/10;
        }
        if(a%s==0)
        return s;
        else
        return -1;
    }
};