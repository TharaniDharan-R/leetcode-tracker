// Last updated: 8/3/2026, 9:10:59 AM
1class Solution {
2    public int maximumGap(int[] nums) {
3        int Max=0;
4        Arrays.sort(nums);
5        for(int i=nums.length-1;i>0;i--){
6            Max=Math.max(Max,nums[i]-nums[i-1]);
7        }
8        return Max;
9    }
10}