// Last updated: 7/9/2026, 9:47:24 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String s:words){
            if(s.startsWith(pref))
            c++;
        }
        return c;
    }
}