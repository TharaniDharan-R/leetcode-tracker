// Last updated: 7/9/2026, 9:49:38 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList <Integer> a=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])&&!a.contains(nums2[i]))
            a.add(nums2[i]);
        }
        int b[]=new int[a.size()];
        int c=0;
        for(int i=0;i<b.length;i++){
            b[c++]=a.get(i);
        }
        return b;
    }
}