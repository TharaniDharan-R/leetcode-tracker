// Last updated: 7/9/2026, 9:50:11 AM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       // int n=0;
        for(int i:map.keySet() ){
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}