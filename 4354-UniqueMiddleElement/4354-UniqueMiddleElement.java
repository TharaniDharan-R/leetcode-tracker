// Last updated: 7/9/2026, 9:45:31 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid =(nums.length/2);
        mid = nums[mid];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(mid==nums[i])
            c++;
        }
        if(c==1)
        return true;
        return false;
    }
}