// Last updated: 7/9/2026, 9:45:55 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int m=nums[nums.length-1];
        int sm=nums[nums.length-2];
        int s=nums[0];
        int res=m+sm-s;
        return res;
    }
}