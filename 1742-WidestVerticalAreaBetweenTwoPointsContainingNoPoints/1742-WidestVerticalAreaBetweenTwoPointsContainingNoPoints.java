// Last updated: 7/9/2026, 9:48:13 AM
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n= points.length;
       int s[]=new int[n];
       for(int i=0;i<n;i++){
        s[i]=points[i][0];
       }
       Arrays.sort(s);
       int ans=0;
       for(int i=1;i<n;i++){
        ans=Math.max(ans,s[i]-s[i-1]);
       }
       return ans;

    }
}