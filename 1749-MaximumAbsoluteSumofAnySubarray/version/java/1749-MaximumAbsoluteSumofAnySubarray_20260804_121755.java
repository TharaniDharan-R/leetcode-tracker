// Last updated: 8/4/2026, 12:17:55 PM
1class Solution {
2    public int maxAbsoluteSum(int[] nums) {
3        // int max=Integer.MIN_VALUE;
4        // for(int i=0;i<nums.length;i++){
5        //     int sum=0;
6        //     for(int j=i;j<nums.length;j++){
7        //         sum+=nums[j];
8        //         //System.out.println(sum);
9        //         max=Math.max(max,Math.abs(sum));
10        //     }
11        // }
12        // return max;
13         int smax=nums[0];
14        int res=nums[0];
15        int smin=nums[0];
16        int res1=nums[0];
17        for(int i=1;i<nums.length;i++){
18            smax=Math.max(smax+nums[i],nums[i]);
19            res=Math.max(smax,res);
20            
21            smin=Math.min(smin+nums[i],nums[i]);
22            res1=Math.min(smin,res1);
23        }
24        return Math.max(res,Math.abs(res1));
25    }
26}