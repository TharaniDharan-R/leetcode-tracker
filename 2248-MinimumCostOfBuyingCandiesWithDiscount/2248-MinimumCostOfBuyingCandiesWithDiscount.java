// Last updated: 7/9/2026, 9:47:30 AM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int c=0;
        for(int i=cost.length-1;i>=0;i-=3){
            c+=cost[i];
            if(i-1>=0){
                c+=cost[i-1];
            }
        }
        return c;
    }
}