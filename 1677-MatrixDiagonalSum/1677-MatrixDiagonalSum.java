// Last updated: 7/9/2026, 9:48:17 AM
class Solution {
    public int diagonalSum(int[][] m) {
        int s=0;
       for(int i=0;i<m.length;i++)
       {
        for(int j=0;j<m.length;j++)
        {
           if(i==j)
           s+=m[i][j];
           if((i+j)==(m.length-1) && i!=j)
           s+=m[i][j];
            }            
        }
        return s;
       } 
    }
