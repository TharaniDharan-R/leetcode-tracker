// Last updated: 8/4/2026, 2:18:53 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer>hm= new HashMap<>();
4        for(int i:nums){
5            hm.put(i,hm.getOrDefault(i,0)+1);
6        }
7        List<Map.Entry<Integer,Integer>>ls= new ArrayList<>(hm.entrySet());
8        ls.sort((a,b)->b.getValue()-a.getValue());
9        int ans[]=new int[k];
10        for(int i=0;i<k;i++){
11            ans[i]=ls.get(i).getKey();
12        }
13        return ans;
14    }
15}