// Last updated: 7/9/2026, 9:48:27 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //ArrayList<Integer> ls=new ArrayList<>();
        //Arrays.sort(nums);
        int a[]=new int [nums.length];
       for(int i=0;i<nums.length;i++){
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<nums[i]&&j!=i)
            c++;
        }
        a[i]=c;
       // ls.add(c);
      

       } 
       return a;
    }
}