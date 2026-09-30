// Last updated: 9/30/2026, 11:28:16 AM
1class Solution {
2    public int search(int[] nums, int target) {
3       int l=0;
4       int r=nums.length-1;
5       while(l<=r){
6        int mid= (l+r)/2;
7        if(nums[mid]== target)
8        return mid;
9        else if(nums[mid]<=target){
10            l=mid+1;
11        }
12        else{
13            r=mid-1;
14        }
15       }
16       return -1;
17    }
18}