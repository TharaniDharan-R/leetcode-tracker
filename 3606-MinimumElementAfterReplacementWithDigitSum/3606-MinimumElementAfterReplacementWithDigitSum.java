// Last updated: 7/9/2026, 9:46:17 AM
class Solution {
    public int minElement(int[] nums) {
        int k=Integer.MAX_VALUE;
        int a[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int digit=nums[i]%10;
                a[i]+=digit;
                nums[i]/=10; 
            }
            k=Math.min(a[i],k);
        }
        // Arrays.sort(a);
        return k;
    }
}