// Last updated: 11/7/2026, 9:37:50 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int ans []=new int[nums.length];
4        int pre=1;
5        for(int i=0;i<nums.length;i++){
6            ans[i]=pre;
7            pre=pre * nums[i];
8        }
9        int suf=1;
10        for(int i= nums.length-1;i>=0;i--){
11            ans[i]*=suf;
12            suf=suf*nums[i];
13        }
14        return ans;
15    }
16}