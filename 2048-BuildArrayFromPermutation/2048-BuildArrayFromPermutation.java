// Last updated: 7/9/2026, 9:47:46 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int []a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[nums[i]];
        }
        return a;
    }
}