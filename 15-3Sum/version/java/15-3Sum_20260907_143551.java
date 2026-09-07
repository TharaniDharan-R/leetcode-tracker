// Last updated: 9/7/2026, 2:35:51 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>>ls= new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length-2;i++){
6            if(i>0 && nums[i]==nums[i-1]){
7                continue;
8            }
9            int l=i+1;
10            int r=nums.length-1;
11            int t=-nums[i];
12            while(l<r){
13                if(t==nums[l]+nums[r]){
14                    ls.add(Arrays.asList(nums[i],nums[l],nums[r]));
15                    while(l<r && nums[l]==nums[l+1]){
16                        l++;
17                    }
18                    while(l<r && nums[r]==nums[r-1]){
19                        r--;
20                    }
21                    l++;
22                    r--;
23                }
24                else if(nums[l]+nums[r]<t){
25                    l++;
26                }
27                else{
28                    r--;
29                }
30            }
31
32        }
33        return ls;
34    }
35}