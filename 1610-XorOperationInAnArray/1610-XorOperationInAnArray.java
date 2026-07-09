// Last updated: 7/9/2026, 9:48:21 AM
class Solution {
    public int xorOperation(int n, int start) {
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            a[i]=start+2*i;
             s^=a[i];
        }
        // for(int i=0;i<n;i++){
           
        // }
     //   System.out.print(s);
         return s;
    }
   

}