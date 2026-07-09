// Last updated: 7/9/2026, 9:49:16 AM
class Solution {
    public boolean detectCapitalUse(String w) {
        int upperCount = 0;
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) >= 'A' && w.charAt(i) <= 'Z') {
                upperCount++;
            }
        }
        if (upperCount == w.length()) {
            return true;
        }
        if (upperCount == 0) {
            return true;
        }
        if (upperCount == 1 && w.charAt(0) >= 'A' && w.charAt(0) <= 'Z') {
            return true;
        }

        return false;
    }
}
