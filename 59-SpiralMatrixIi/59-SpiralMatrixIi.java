// Last updated: 7/9/2026, 9:50:51 AM
class Solution {
    public int[][] generateMatrix(int n) {
     int[][] arr = new int[n][n];

int v = 1;
int mincol = 0;
int maxcol = n-1 ;
int minrow = 0;
int maxrow = n -1;

while (v <= n * n) {
for (int i = mincol; i <= maxcol; i++) {
arr[minrow][i] = v++;
}

for (int i = minrow + 1; i <= maxrow; i++) {
arr[i][maxcol] = v++;
}

for (int i = maxcol - 1; i >= mincol; i--) {
arr[maxrow][i] = v++;
}

for (int i = maxrow - 1; i > minrow; i--) {
arr[i][mincol] = v++;
}

mincol++;
minrow++;
maxcol--;
maxrow--;

}
return arr;
 }
}