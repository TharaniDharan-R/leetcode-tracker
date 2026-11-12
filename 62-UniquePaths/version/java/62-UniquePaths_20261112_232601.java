// Last updated: 11/12/2026, 11:26:01 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int mat [][]= new int[m][n];
4        for(int i=0;i<m;i++){
5            for(int j=0;j<n;j++){
6                mat[i][j]=1;
7            }
8        }
9        for(int i=m-2;i>=0;i--){
10            for(int j=n-2;j>=0;j--){
11                mat[i][j]=mat[i][j+1]+mat[i+1][j];
12            }
13        }
14        return mat[0][0];
15
16
17    }
18}