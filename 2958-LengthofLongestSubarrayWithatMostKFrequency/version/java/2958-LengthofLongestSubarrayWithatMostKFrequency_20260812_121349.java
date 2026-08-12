// Last updated: 8/12/2026, 12:13:49 PM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3    HashMap<Integer,Integer>hm= new HashMap<>();
4       int left=0;
5       int maxlen=0;
6       for(int i=0;i<nums.length;i++){
7        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
8        while(hm.get(nums[i])>k){
9            hm.put(nums[left],hm.get(nums[left])-1);
10            left++;
11        }
12        maxlen=Math.max(maxlen,i-left+1);
13       }
14       return maxlen;
15    //     int maxlen=0;
16    //    for(int i=0;i<nums.length;i++){
17    //     HashMap<Integer,Integer> hm= new HashMap<>();
18    //     for(int j=i;j<nums.length;j++){
19    //         hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
20    //         if(hm.get(nums[j])>k)
21    //         break;
22    //     maxlen=Math.max(maxlen,j-i+1);
23    //     }
24
25    //    } 
26    //    return maxlen;
27      
28    }
29}