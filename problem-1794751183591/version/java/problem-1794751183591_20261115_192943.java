// Last updated: 11/15/2026, 7:29:43 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int ans=0;
4        Arrays.sort(nums);
5        int large =nums[nums.length-1];
6        for(int i=0;i<nums.length-1;i++){
7            int d=large-nums[i];
8            ans+=d;
9        }
10        return ans;
11    }
12}