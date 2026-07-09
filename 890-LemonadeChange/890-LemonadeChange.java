// Last updated: 7/9/2026, 9:48:56 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twen=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
            five++;
            }
            else if(bills[i]==10){
                if(five>=1)
                {
                    five--;
                    ten++;
                }
                else
                return false;
            }
            else if(bills[i]==20){
                if(five>=1 && ten>=1)
                {
                    five-=1;
                    ten--;
                    twen++;
                }
                else if(five>=3)
                {
                    five-=3;
                    twen++;
                }
                else{
                return false;
                }
            }
        }
        return true;
        
    }
}