// Last updated: 9/7/2026, 10:26:24 AM
1class Solution {
2    public int[] twoSum(int[] num, int target) {
3//         // int ans[]=new int[2];
4//         // int i=0;
5//         // while(i<numbers.length-1){
6//         //     for(int j=0;j<numbers.length;j++){
7//         //         if((numbers[i]+numbers[j])==target){
8//         //             ans[0]=i+1;
9//         //             ans[1]=j+1;
10//         //            return ans;  
11//         //         }
12//         //     }
13//         //     i++;
14//         // }
15//         // return ans;
16       // int ans[]=new int[2];
17        int i=0;
18        int j=num.length-1;
19        while(i<j){
20            int sum=num[i]+num[j];
21            if(sum > target){
22                j--;
23            }
24            else if(sum==target){
25                // ans[0]=i+1;
26                // ans[1]=j+1;
27                return new int[]{i+1,j+1};
28            }
29            else
30            i++;
31        }
32        return new int[]{};
33    }
34}
35