// Last updated: 7/15/2026, 12:09:27 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer,Integer> hm= new HashMap<>();
4        int sum=0;
5        int max=0;
6        hm.put(0,-1);
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0)
9            sum+=-1;
10            else
11            sum+=1;
12            if(hm.containsKey(sum)){
13                max= Math.max(max,i-hm.get(sum));
14            }
15            else
16            hm.put(sum,i);
17        }
18        return max;
19    }
20}