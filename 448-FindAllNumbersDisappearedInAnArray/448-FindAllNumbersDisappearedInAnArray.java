// Last updated: 7/9/2026, 9:49:26 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     Arrays.sort(nums);
     HashSet<Integer> hs=new HashSet<>();
     for(int n:nums){
        hs.add(n);
     }  
     List<Integer> ls= new ArrayList<>();
     for(int i=1;i<=nums.length;i++){
        if(!hs.contains(i)){
            ls.add(i);
        }
     }
     return ls;
    }
}