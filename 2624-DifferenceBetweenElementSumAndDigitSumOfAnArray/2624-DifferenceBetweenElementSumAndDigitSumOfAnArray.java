// Last updated: 7/9/2026, 9:47:01 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,dig=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            int num=nums[j];
        while(num>0){  
            dig+=num%10;
            num=num/10;
            
        }  
        }    
        return Math.abs(sum-dig);
    }
}