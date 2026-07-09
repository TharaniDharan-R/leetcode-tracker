// Last updated: 7/9/2026, 9:45:58 AM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
       // for(char c:s.toCharArray())
       for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        
        return set.size();
    }
}