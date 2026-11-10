// Last updated: 11/10/2026, 10:25:08 AM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        //System.out.print(mat.length);
4       // System.out.print(mat[1].length);
5       int sum=0;
6        for(int i=0; i<mat.length;i++){
7            for(int j=0;j<mat[i].length;j++){
8                if(i==j || i+j==mat.length-1){
9                    sum+=mat[i][j];
10                }
11            }
12        } 
13        return sum;
14    }
15}