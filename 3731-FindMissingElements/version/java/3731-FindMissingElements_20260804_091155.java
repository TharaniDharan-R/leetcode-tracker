// Last updated: 8/4/2026, 9:11:55 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        List<Integer>ls=new ArrayList<>();
6        int p=0;
7        for(int i=nums[0];i<=nums[n-1];i++){
8            ls.add(i);
9        }
10        for(int i=0;i<nums.length;i++){
11           if(ls.contains(nums[i])){
12            ls.remove(Integer.valueOf(nums[i]));
13           }
14        }
15        return ls;
16
17    }
18}