// Last updated: 11/12/2026, 11:47:07 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] ob) {
3        for(int i=0;i<ob.length;i++){
4            for(int j=0;j<ob[0].length;j++){
5                if(ob[i][j]==0){
6                ob[i][j]=1;
7                }
8                else
9                ob[i][j]=0;
10            }
11        }
12        int n= ob[0].length;
13        int m= ob.length;
14        if(ob[ob.length-1][ob[0].length-1]==0){
15            return 0;
16        }
17         for(int j = ob[0].length-2; j >= 0; j--) {
18            ob[m-1][j] = ob[m-1][j] * ob[m-1][j+1];
19        }
20
21        // Last column
22        for(int i = ob.length-2; i >= 0; i--) {
23            ob[i][n-1] = ob[i][n-1] * ob[i+1][n-1];
24        }
25        for(int i=ob.length-2;i>=0;i--){
26            for(int j=ob[0].length-2;j>=0;j--){
27                if(ob[i][j]!=0){
28                ob[i][j]=ob[i][j+1]+ob[i+1][j];
29                }
30            }
31        }
32        return ob[0][0];
33    }
34}