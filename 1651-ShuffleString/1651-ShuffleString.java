// Last updated: 7/9/2026, 9:48:18 AM
class Solution {
    public String restoreString(String s, int[] in) 
    {
        char t[]=new char[in.length];
        for(int i=0;i<in.length;i++)
        {
           t[in[i]]=s.charAt(i);
           }
        return new String(t);    
    }
}