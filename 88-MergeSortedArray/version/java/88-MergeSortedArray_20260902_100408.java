// Last updated: 9/2/2026, 10:04:08 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int len=0;
4        if(nums1.length>nums2.length){
5            len=nums1.length;
6        }
7        else
8        len= nums1.length;
9        if(len== nums1.length){
10            for(int i=0;i<nums2.length;i++){
11                for(int j=0;j<len;j++){
12                    if(nums1[j]==0){
13                        nums1[j]=nums2[i];
14                        break;
15                    }
16                }
17            }
18        }
19        Arrays.sort(nums1);
20        
21    }
22}