// Last updated: 7/13/2026, 2:42:19 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        // int ans[]=new int[nums.length];
4        // for(int i=0;i<nums.length;i++){
5        //     int p=1;
6        //     for(int j=0;j<nums.length;j++){
7        //         if(i!=j){
8        //             p*=nums[j];
9        //         }
10        //     }
11        //     ans[i]=p;
12        // }
13        int ans[] = new int [nums.length];
14        int n= nums.length;
15        ans[0]=1;
16        for(int i=1;i<n;i++){
17            ans[i]=ans[i-1]*nums[i-1];
18        }
19        int right=1;
20        for(int i=n-1;i>=0;i--){
21            ans[i]*=right;
22            right*=nums[i];
23        }
24        return ans;
25    }
26}
27// class Solution {
28//     public int[] productExceptSelf(int[] nums) {
29//         int n = nums.length;
30//         int[] ans = new int[n];
31
32//         // Step 1: Store left products
33//         ans[0] = 1;
34//         for (int i = 1; i < n; i++) {
35//             ans[i] = ans[i - 1] * nums[i - 1];
36//         }
37
38//         // Step 2: Multiply with right products
39//         int right = 1;
40//         for (int i = n - 1; i >= 0; i--) {
41//             ans[i] = ans[i] * right;
42//             right = right * nums[i];
43//         }
44
45//         return ans;
46//     }
47// }