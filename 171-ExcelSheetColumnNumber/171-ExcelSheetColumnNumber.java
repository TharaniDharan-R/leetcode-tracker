// Last updated: 7/9/2026, 9:50:09 AM
class Solution 
{
    public int titleToNumber(String s) 
    {
       int r=0;
       for(int i=0;i<s.length();i++)
       {
        r*=26;
        r+=s.charAt(i)-'A'+1;
       } 
       return r;
    }
}