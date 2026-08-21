// Last updated: 8/21/2026, 2:52:06 PM
1
2class Solution {
3    public boolean isValidSudoku(char[][] b) {
4        Set<String> s= new HashSet<>();
5        for(int i=0;i<9;i++){
6            for(int j=0;j<9;j++){
7                char c=b[i][j];
8                if(c!='.'){
9                    if(!s.add(c+"r"+i)||!s.add(c+"c"+j)||!s.add(c+"b"+i/3+j/3)){
10                        return false;
11                    }
12                }
13            }
14        }
15        return true;
16    }
17}