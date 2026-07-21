// Last updated: 7/22/2026, 1:26:48 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int smax=nums[0];
4        int res=nums[0];
5        for(int i=1;i<nums.length;i++){
6            smax=Math.max(smax+nums[i],nums[i]);
7            res=Math.max(smax,res);
8        }
9        return res;
10    }
11}