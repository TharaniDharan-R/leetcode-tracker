// Last updated: 7/9/2026, 9:51:01 AM
class Solution
 {
    public int searchInsert(int[] n, int t)
    {
        int a=0;
        for(int i=0;i<n.length;i++)
        {
           if(n[i]>=t)
              return i;
        }
        return n.length;
    }
}