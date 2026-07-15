// Last updated: 7/15/2026, 2:00:35 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int ans[]=new int[nums.length];
4        int odd[]=new int [nums.length];
5        int c=0;
6        int d=0;
7        
8        for(int i=0;i<nums.length;i++){
9            if(nums[i]%2==0)
10            ans[c++]=nums[i];
11            else
12            odd[d++]=nums[i];
13        }
14        int s=c;
15        for(int i=0;i<nums.length-s;i++){
16            ans[c++]=odd[i];
17        }
18        return ans;
19    }
20}