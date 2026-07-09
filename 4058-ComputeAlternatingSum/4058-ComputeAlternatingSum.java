// Last updated: 7/9/2026, 9:45:59 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            even+=nums[i];
            if(i%2!=0)
            odd-=nums[i];
        }
        // System.out.println(odd);
        // System.out.print(even);
        return odd+even;
        
    }
}