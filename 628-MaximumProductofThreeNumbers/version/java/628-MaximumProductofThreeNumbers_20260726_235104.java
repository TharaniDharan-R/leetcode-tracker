// Last updated: 7/26/2026, 11:51:04 PM
1// class Solution {
2//     public int maximumProduct(int[] nums) {
3//         int l=nums.length;
4//         int[]a= new int[l];
5        
6//          int p=1;
7//          for(int i=l-1;i>=0;i--){
8//         //     p*=nums[i];
9//          a[i]=(Math.abs(nums[i]));
10//          }
11//          Arrays.sort(a);
12//          for(int i=1;i<=3;i++){
13//         //     p*=nums[i];
14//           p*=(a[l-i]);
15//          }
16       
17//         return p;
18//     }
19// }
20import java.util.*;
21
22class Solution {
23    public int maximumProduct(int[] nums) {
24        Arrays.sort(nums);
25        int n = nums.length;
26        int case1 = nums[n-1] * nums[n-2] * nums[n-3];
27       int case2 = nums[0] * nums[1] * nums[n-1];
28       return Math.max(case1, case2);
29       
30    }
31}
32