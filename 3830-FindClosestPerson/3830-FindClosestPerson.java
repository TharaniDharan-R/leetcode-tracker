// Last updated: 7/9/2026, 9:46:11 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        return (Math.abs(x-z)==Math.abs(z-y)?0:Math.abs(x-z)>Math.abs(z-y)?2:1);
        
    }
}