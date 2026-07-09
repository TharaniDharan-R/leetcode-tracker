// Last updated: 7/9/2026, 9:49:18 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=num,s=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                s+=i;
            }
        }
        if(sum==s)
        return true;
        else
        return false;
    }
}