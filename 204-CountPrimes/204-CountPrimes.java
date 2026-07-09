// Last updated: 7/9/2026, 9:50:02 AM
class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean a[]=new boolean[n];
        Arrays.fill(a,true);
        if(n<2)
        return 0;
        for(int i=2;i*i<n;i++){
            if(a[i]){
                for(int j=i*i;j<n;j+=i){
                    a[j]=false;
                }
            }
        }
        for(int i =2;i<n;i++){
            if(a[i])
            c++;
        }
        return c;
    }
}