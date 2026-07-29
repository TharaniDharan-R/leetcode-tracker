// Last updated: 7/29/2026, 10:32:27 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3         List<Integer> al=new ArrayList<>();
4        
5        int k=nums.length/3;
6        HashMap<Integer,Integer> hm= new HashMap<>();
7        for(int i:nums){
8            hm.put(i,hm.getOrDefault(i,0)+1);
9        }
10        for(int i:hm.keySet()){
11            if(hm.get(i)>k){
12                al.add(i);
13            }
14        }
15        return al;
16    }
17}