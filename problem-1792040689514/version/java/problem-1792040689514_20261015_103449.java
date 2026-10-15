// Last updated: 10/15/2026, 10:34:49 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int sum=0;
4        for(int i=0;i<nums.size();i++){
5        HashSet<Integer> hs= new HashSet<>();
6            for(int j=i;j<nums.size();j++){
7                for(int k=i;k<=j;k++){
8                    hs.add(nums.get(k));
9                }
10                int count = hs.size();
11                sum += count * count;
12            }
13        }
14        return sum;
15    }
16}