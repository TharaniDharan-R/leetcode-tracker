// Last updated: 7/9/2026, 9:50:26 AM
class Solution {
    public int singleNumber(int[] nums) {
      int result =0;
      for(int num :nums){
        System.out.print(result);
        result ^=num;
      }  
       return result;
    }
}