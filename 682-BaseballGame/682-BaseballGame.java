// Last updated: 7/9/2026, 9:49:05 AM
class Solution {
    public int calPoints(String[] op) {
        int a[]=new int[op.length];
        int n=0;
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
            a[n]=(a[n-1]+a[n-2]);
            n++;
            }
            else if(op[i].equals("D")){
            a[n]=2*(a[n-1]);
            n++;
        }
            else if(op[i].equals("C"))
            n--;
            else{
            a[n]=Integer.parseInt(op[i]);
            n++;
            }

        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }

       return sum;
        
        
    }
}