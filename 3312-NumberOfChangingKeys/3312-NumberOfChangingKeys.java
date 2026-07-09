// Last updated: 7/9/2026, 9:46:36 AM
class Solution {
    public int countKeyChanges(String s) {
        int co=0;
        for(int i=0;i<s.length()-1;i++){
            char c=Character.toLowerCase(s.charAt(i));
            char d=Character.toLowerCase(s.charAt(i+1));
            if(c!=d)
            co++;
        }
        return co;
    }
}