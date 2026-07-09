// Last updated: 7/9/2026, 9:47:53 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int c=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                c++;
                coins-=costs[i];
            }
        }
        return c;
    }
}