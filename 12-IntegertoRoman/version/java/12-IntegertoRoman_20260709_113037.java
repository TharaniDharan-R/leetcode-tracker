// Last updated: 7/9/2026, 11:30:37 AM
1class Solution {
2    public String intToRoman(int num) {
3        int a[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
4        String b[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5        StringBuilder sb= new StringBuilder();
6        for(int i=0;i<a.length;i++){
7            while(num>=a[i]){
8                num=num-a[i];
9                sb.append(b[i]);
10            }
11        }
12        return sb.toString();
13    }
14}