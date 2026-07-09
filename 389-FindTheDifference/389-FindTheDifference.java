// Last updated: 7/9/2026, 9:49:31 AM
class Solution {
    public char findTheDifference(String s, String t) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            diff -= s.charAt(i);
            diff += t.charAt(i);
        }
        diff += t.charAt(s.length());
        return (char) diff;
    }
}