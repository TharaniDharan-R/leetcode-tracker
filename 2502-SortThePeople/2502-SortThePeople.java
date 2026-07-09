// Last updated: 7/9/2026, 9:47:12 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map =new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
         String a[]=new String[names.length];
         int ii=0;
        for(int i=heights.length-1;i>=0;i--){
            a[ii++]=map.get(heights[i]);
        }
        return a;
    }
}