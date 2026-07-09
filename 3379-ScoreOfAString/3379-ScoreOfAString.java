// Last updated: 7/9/2026, 9:46:31 AM
class Solution {
    public int scoreOfString(String s) {
        int a=0;
        for(int i=0;i<s.length()-1;i++){
            a+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return a;
    }
}