// Last updated: 7/9/2026, 9:49:23 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d=s+s;
        String m=d.substring(1,d.length()-1);
        return m.contains(s);
    }
}