// Last updated: 8/5/2026, 9:56:31 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        // List<Integer>ls= new ArrayList <>();
4        // for(int i: nums){
5        //     ls.add(i);
6        // }
7        // int ans=0;
8        // for(int i=1;i<nums.length+1;i++){
9        //     if(!ls.contains(i)){
10        //     return i;
11        //     }
12        // }
13        // return (nums.length+1);
14        HashSet<Integer> set = new HashSet<>();
15
16        for (int num : nums) {
17            if (num > 0) {
18                set.add(num);
19            }
20        }
21
22        int ans = 1;
23        while (set.contains(ans)) {
24            ans++;
25        }
26
27        return ans;
28    
29
30    }
31}