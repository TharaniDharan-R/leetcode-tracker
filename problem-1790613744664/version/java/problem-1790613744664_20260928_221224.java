// Last updated: 9/28/2026, 10:12:24 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int c=0;
4        int max=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                c++;
8            max=Math.max(c,max);
9            }
10            if(nums[i]==0){
11                c=0;
12            }
13        }
14        return max;
15    }
16}