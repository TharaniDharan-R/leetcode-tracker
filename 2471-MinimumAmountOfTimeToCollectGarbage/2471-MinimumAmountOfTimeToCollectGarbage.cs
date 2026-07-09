// Last updated: 7/9/2026, 9:47:17 AM
public class Solution {
    public int GarbageCollection(string[] arr, int[] tra) {
        int res=0,pt=0,gt=0,mt=0;
        int n=arr.Length;
        for(int i=0;i<n;i++){
            res+=arr[i].Length;
            if(arr[i].Contains('P')){
                res+=pt;
                pt=0;
            }
            if(arr[i].Contains('G')){
                res+=gt;
                gt=0;}
            if(arr[i].Contains('M')){
                res+=mt;
                mt=0;}
            if(i<n-1){
            pt+=tra[i];
            gt+=tra[i];
            mt+=tra[i];}
        }
        return res;
    }
}