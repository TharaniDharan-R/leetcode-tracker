// Last updated: 9/7/2026, 3:01:23 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3    Set s= new HashSet<>();
4    for(int i=0;i<9;i++){
5        for(int j=0;j<9;j++){
6            char c= board[i][j];
7            if(c!='.'){
8                if(!s.add(c+"c"+i)||!s.add(c+"r"+j)||!s.add(c+"b"+i/3+j/3)){
9                    return false;
10                }
11            }
12        }
13    }
14    return true;
15    }
16}