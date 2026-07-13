// Last updated: 7/13/2026, 2:05:34 PM
1class Solution {
2    public int subarraySum(int[] nums) {
3        int s=0;
4        for(int i=0;i<nums.length;i++){
5            int start =Math.max(0,i-nums[i]);
6            for(int j=start;j<=i;j++){
7                s+=nums[j];
8            }
9        }
10        return s;
11    }
12}