// Last updated: 7/9/2026, 9:46:26 AM
class Solution {
    public double minimumAverage(int[] nums) {
         double d =Double.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            d=Math.min(d,(((double)nums[i]+nums[nums.length-i-1])/2));
        }
        return d;
    }
}