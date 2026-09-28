// Last updated: 9/28/2026, 9:48:36 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int []a=new int[n*2];
5        for(int i=0;i<n;i++){
6            a[i]=nums[i];
7            a[i+n]=nums[i];
8            // System.out.print(a[i]);
9        }
10        
11        return a;
12    }
13}