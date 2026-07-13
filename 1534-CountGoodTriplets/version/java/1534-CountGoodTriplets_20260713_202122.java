// Last updated: 7/13/2026, 8:21:22 PM
1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int count=0;
4        for(int i=0;i<arr.length;i++){
5           for(int j=i+1;j<arr.length;j++){
6            for(int k=j+1;k<arr.length;k++){
7                 if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && 
8            Math.abs(arr[i]-arr[k])<=c){
9                count++;
10            }
11            }
12           }
13        }
14        return count;
15    }
16}