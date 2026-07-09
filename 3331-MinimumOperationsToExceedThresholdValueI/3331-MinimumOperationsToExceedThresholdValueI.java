// Last updated: 7/9/2026, 9:46:34 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k)
            c++;
        }
        return c;
    }
}