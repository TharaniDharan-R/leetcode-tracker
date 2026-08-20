// Last updated: 8/21/2026, 12:50:38 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int a1[]=new int[nums.length];
4        int a2[]=new int[nums.length];
5        int ans[]=new int[nums.length];
6        int c1=1;
7        int c2=1;
8        int c=0;
9        a1[0]=nums[0];
10        a2[0]=nums[1];
11        for(int i=2;i<nums.length;i++){
12            if(a1[c1-1]>a2[c2-1]){
13                a1[c1++]=nums[i];   
14            }
15            else
16                a2[c2++]=nums[i];            
17            // if(nums[i]<ans[i-1]){
18            //     ans[c++]=nums[i];
19            // }
20            // else
21            // ans[c++]=nums[i];
22        }
23        for(int i=0;i<c1;i++){
24            ans[c++]=a1[i];
25        }
26        for(int i=0;i<c2;i++){
27            ans[c++]=a2[i];
28        }
29        return ans;
30    }
31}