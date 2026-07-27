// Last updated: 7/27/2026, 12:35:02 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums[nums.length-1]-1;
5        int b=nums[nums.length-2]-1;
6        return a*b;
7    }
8}