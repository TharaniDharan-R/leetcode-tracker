// Last updated: 7/9/2026, 9:51:06 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        if(nums.length==0)
        return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }
           
        }
        return c;
    }
}