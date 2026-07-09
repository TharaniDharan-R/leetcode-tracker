// Last updated: 7/9/2026, 9:46:14 AM
class Solution {
    public int[] transformArray(int[] nums) {
       // int [] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            nums[i]=0;
            else
            nums[i]=1;
        }
        Arrays.sort(nums);
        return nums;
    }
}