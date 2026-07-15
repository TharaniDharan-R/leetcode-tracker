// Last updated: 7/15/2026, 4:14:10 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> al=new ArrayList<>();
4        HashMap<Integer,Integer> hm= new HashMap<>();
5        for(int i: nums){
6            hm.put(i,hm.getOrDefault(i,0)+1);
7        }
8        for(int i:hm.keySet()){
9            if(hm.get(i)>1)
10            al.add(i);
11    
12        }
13        return al;
14    }
15
16}