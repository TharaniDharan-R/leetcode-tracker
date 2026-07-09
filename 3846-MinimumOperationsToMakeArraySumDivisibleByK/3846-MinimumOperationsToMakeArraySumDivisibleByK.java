// Last updated: 7/9/2026, 9:46:09 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int r=sum%k;
        return r;
    }
}