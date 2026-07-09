// Last updated: 7/9/2026, 9:48:54 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        //boolean b=false;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length-1;i++){ 
            if(nums[i]<=nums[i+1]){
            a++;
            }
            if(nums[i]>=nums[i+1]){
                b++;
            }
       
            // if(nums[i]>=nums[j+1])
            // return true;

        }
         if(a==nums.length-1||b==nums.length-1)
        return true;
        return false;
        
    }
}