// Last updated: 7/9/2026, 9:46:41 AM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int min[]=new int[nums.length];
       
        for(int i=0;i<nums.length;i+=2){
            System.out.println(nums[i]);
            // int a =nums[i];
            // int b=nums[i+1];
            // int temp =a;
            // a=b;
            // b=temp;
            min[i] =nums[i+1];
            min[i+1]=nums[i];
            //System.out.print(a+" "+b);
        }
        return min;

    }
}  