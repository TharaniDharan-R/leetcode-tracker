// Last updated: 7/9/2026, 9:46:20 AM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<height.length;i++){
            if(i>0){
            if(height[i-1]>threshold)
            l.add(i);
            }
        }
        return l;
    }
}