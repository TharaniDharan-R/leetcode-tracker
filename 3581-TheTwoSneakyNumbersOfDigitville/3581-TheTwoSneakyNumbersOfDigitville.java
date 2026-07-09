// Last updated: 7/9/2026, 9:46:22 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }
        int a[]=new int[2];
        int s=0;
        for( int key:maps.keySet()){
            if(maps.get(key)==2){
                a[s++]=key;
            }
        }
        
        return a;
        
    }
}