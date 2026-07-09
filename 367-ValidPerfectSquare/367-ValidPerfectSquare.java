// Last updated: 7/9/2026, 9:49:35 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        // //int s=0;
        // if(num==1)
        // return true;;
        // for(int i=1;i<=(num/2);i++){
        //    // s=i*i;
        //     if(i*i==num)
        //     return true;
        // }
        // return false;
        int s=(int)Math.sqrt(num);
        if(s*s==num)
        return true;
        return false;

    }
}