// Last updated: 8/22/2026, 3:59:52 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map= new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7       // int n=0;
8        for(int i:map.keySet() ){
9            if(map.get(i)>nums.length/2){
10                return i;
11            }
12        }
13        return -1;
14    }
15}