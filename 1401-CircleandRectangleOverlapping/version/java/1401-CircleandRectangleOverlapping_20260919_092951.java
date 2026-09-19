// Last updated: 9/19/2026, 9:29:51 AM
1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3         int x = Math.max(x1, Math.min(xCenter, x2)) - xCenter;
4        int y = Math.max(y1, Math.min(yCenter, y2)) - yCenter;
5
6        return x * x + y * y <= radius * radius;
7    }
8}