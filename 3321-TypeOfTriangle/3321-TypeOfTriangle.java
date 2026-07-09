// Last updated: 7/9/2026, 9:46:35 AM
class Solution {
    public String triangleType(int[] nums) {
        int a=0;
        int b=0;
        int c=0;

        for(int i=0;i<nums.length-2;i++){
            a=nums[i]+nums[i+1];
            b=nums[i]+nums[i+2];
            c=nums[i+1]+nums[i+2];
            if(a<=nums[i+2] || c<=nums[i] || b<=nums[i+1])
             return "none";
            if(a==b&& b==c)
            return "equilateral";
           else if(a==b || a==c || b==c) 
           return "isosceles";
            
            
      
            
            
            // else if(nums[i]==nums[i+1]||nums[i]==nums[i+2]||nums[i+1]==nums[i+2])
            // return "";
            // else if(nums[i]>nums[i+1])
            // return "none";
        }
          return "scalene";
       
    }
}