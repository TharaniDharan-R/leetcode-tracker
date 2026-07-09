// Last updated: 7/9/2026, 9:50:52 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        String x=s.trim();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' ')
            len=0;
            else
            len++;
        }

        return len;
    }
}