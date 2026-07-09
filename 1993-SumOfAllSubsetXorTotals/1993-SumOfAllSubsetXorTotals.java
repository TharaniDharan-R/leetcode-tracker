// Last updated: 7/9/2026, 9:47:48 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int or = 0;
        for (int num : nums) {
            or |= num;
        }
        return or * (1 << (nums.length - 1));
    }
}