// Last updated: 7/9/2026, 9:46:15 AM
class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
        int sums=0;
        int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            
            for(int j=i+1;j<nums.length;j++){
                sums+=nums[j];
            }
            if((sum-sums)%2==0)
            c++;
            
        }
        return c;
        
    }
}