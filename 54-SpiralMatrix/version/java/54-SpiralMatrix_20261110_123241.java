// Last updated: 11/10/2026, 12:32:41 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] mat) {
3        ArrayList<Integer> list=new ArrayList<>();
4        int t=0;
5        int b=mat.length-1;
6        int l=0;
7        int r=mat[0].length-1;
8        while(t<=b && l<=r){
9            for(int i=l;i<=r;i++){
10                list.add(mat[t][i]);
11            }
12            t++;
13            for(int i=t;i<=b;i++){
14                list.add(mat[i][r]);
15            }
16            r--;
17            if(t<=b){
18            for(int i=r;i>=l;i--){
19                list.add(mat[b][i]);
20            }
21            b--;
22            }
23            if(l<=r){
24                for(int i=b;i>=t;i--){
25                    list.add(mat[i][l]);
26                }
27                l++;
28            }
29        }
30        return list;
31    }
32}