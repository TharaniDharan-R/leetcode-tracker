// Last updated: 7/9/2026, 9:47:57 AM
class Solution {
    public int arraySign(int[] nums) {
        int a=1;
        int cn=0;
        int cp=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
                cn++;
            else if(nums[i]>0)
            cp++;
            else
            return 0;
            
        }
       if(cn%2==0)
       return 1;
       else 
       return -1;
    }
}