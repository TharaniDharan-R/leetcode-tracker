// Last updated: 11/10/2026, 12:25:06 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        if(mat.length *mat[0].length != r*c){
4            return mat;
5        }
6        int ans[][]=new int[r][c];
7            
8        for(int i=0;i<r;i++){
9            for(int j=0;j<c;j++){
10                int index= i*c+j;
11                int oldRow=index/mat[0].length;
12                int oldCol=index%mat[0].length;
13                ans[i][j]=mat[oldRow][oldCol];
14            }
15        }
16        return ans;
17      
18        
19    }
20}