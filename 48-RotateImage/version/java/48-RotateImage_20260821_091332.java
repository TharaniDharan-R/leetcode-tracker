// Last updated: 8/21/2026, 9:13:32 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n=matrix.length;
4        int a[][]=new int[n][n];
5        for(int i=0;i<n;i++){
6            for(int j=n-1;j>=0;j--){
7                a[i][j]=matrix[n-1-j][i];
8            }
9        }
10        for(int i=0;i<n;i++){
11            for(int j=n-1;j>=0;j--){
12                matrix[i][j]=a[i][j];
13               System.out.print(a[i][j]);
14            }
15            System.out.println();
16        }
17    }
18}