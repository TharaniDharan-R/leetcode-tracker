// Last updated: 7/9/2026, 9:46:38 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] di) {
        int max = Integer.MIN_VALUE;
        int r = 0;

        for (int i = 0; i < di.length; i++) {
            int s = 0;
            int p = 1;
            for (int j = 0; j < di[i].length; j++) {
                s += di[i][j] * di[i][j];
                p *= di[i][j];
            }
            if (s > max || (s == max && p > r)) {
                max = s;
                r = p;
            }
        }
        return r;
    }
}