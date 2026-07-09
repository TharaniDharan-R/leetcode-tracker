// Last updated: 7/9/2026, 9:45:33 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long tsum=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=n-k;i--){
            tsum+=(long)nums[i]*mul;
            if(mul==0){
                tsum+=nums[i];
            }
            if(mul>0)
            mul--;
        }
        return tsum;
    }
}