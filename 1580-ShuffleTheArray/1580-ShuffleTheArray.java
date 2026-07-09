// Last updated: 7/9/2026, 9:48:24 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     // for(int j=n;j<nums.length;j++){
        //     //     res[i]=nums[i];
        //     //     res[i+1]=nums[j];
        //     // }
        //     if(i%2==0 && i<n)              
        //     res[i]=nums[i];
        //     else{
        //     res[i]=nums[n];
        //     n++;
        //     }
        int l=0,r=n;
        for(int i=0;i<n*2;i+=2){
            res[i]=nums[l];
            res[i+1]=nums[r];
            l++;
            r++;
        }
        
        return res;
    }
}