// Last updated: 7/9/2026, 9:50:31 AM
class Solution {
    public int maxProfit(int[] prices) {
       int b=prices[0];
       int s=0;
       for(int i=0;i<prices.length;i++){
        if(b>prices[i]){
            b=prices[i];
        }
        else if(prices[i]-b>s){
            s=prices[i]-b;
        }
       }
       return s;
    }
}