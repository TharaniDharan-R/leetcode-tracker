// Last updated: 7/9/2026, 9:51:07 AM
class Solution {
    public int removeDuplicates(int[] nums) {
    //     int a[]=new int[nums.length];
    //     LinkedHashSet<Integer> hs = new LinkedHashSet<>();
    //    for(int i=0;i<nums.length;i++){
    //     hs.add(nums[i]);
    //    }
    //    int co=0;
    //    for(int i:hs){
    //     a[co]=i;
    //     co++;
    //    }
    //    for(int i=0;i<a.length;i++){
    //     nums[i]=a[i];
    //    }   
    //     return hs.size();
    int i=0;int j=0;
    while(j<nums.length){
        if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
        }
        j++;
    }
    return i+1;
    }
}