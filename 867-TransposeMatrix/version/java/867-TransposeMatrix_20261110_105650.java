// Last updated: 11/10/2026, 10:56:50 AM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int ans[][]=new int[matrix[0].length][matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix[i].length;j++){
6                    ans[j][i]=matrix[i][j];
7                
8            }
9        }
10        return ans;
11    }
12}