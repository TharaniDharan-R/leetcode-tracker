// Last updated: 7/9/2026, 9:49:46 AM
class Solution {
    public int missingNumber(int[] nums) {
         int sum=0,n=nums.length*(nums.length+1)/2;
        // for(int i=0;i<9;i++){
        //     sum+=i;
        // }
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        return n-sum; 
    }
}