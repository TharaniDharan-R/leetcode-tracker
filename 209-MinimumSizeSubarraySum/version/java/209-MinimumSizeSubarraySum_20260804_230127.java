// Last updated: 8/4/2026, 11:01:27 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left=0;
4        int sum=0;
5        int min=Integer.MAX_VALUE;
6        for(int i=0;i<nums.length;i++){
7            sum+=nums[i];
8            while(sum>=target){
9                min=Math.min(min,i-left+1);
10                sum-=nums[left];
11                left++;
12            }
13        }
14        if(min==Integer.MAX_VALUE)
15        return 0;
16        return min;
17                
18    }
19}