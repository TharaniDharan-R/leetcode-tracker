// Last updated: 7/9/2026, 9:49:19 AM
class Solution {
    public String[] findRelativeRanks(int[] score) {
       int ar[][]=new int[score.length][2];
       for(int i=0;i<score.length;i++){
        ar[i][0]=score[i];
        ar[i][1]=i;
       }
       Arrays.sort(ar,(a,b)-> Integer.compare(b[0],a[0]));
       String st[]=new String[score.length];
       for(int i=0;i<score.length;i++){
        int ind=ar[i][1];
        if(i==0)
        st[ind]="Gold Medal";
        else if(i==1)
        st[ind]="Silver Medal";
        else if(i==2)
        st[ind]="Bronze Medal";
        else
        st[ind]=String.valueOf(i+1);
       }
       return st;
       
    }
}