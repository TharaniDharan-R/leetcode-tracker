// Last updated: 7/9/2026, 9:48:34 AM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num>0){
            if(num%2==0){
            num=num/2;
            c++;
            }
            else {num-=1;
            c++;
            }
        }
        return c;
    }
}