// Last updated: 7/9/2026, 9:49:52 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];   
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++; 
        }
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--; 
            if (charCount[c - 'a'] < 0) {
                return false; 
            }
        }

        return true; 
    }
}