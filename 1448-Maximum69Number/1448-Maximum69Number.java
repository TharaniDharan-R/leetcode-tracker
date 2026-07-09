// Last updated: 7/9/2026, 9:48:31 AM
class Solution {
    public int maximum69Number (int num) {
      
        String s = String.valueOf(num); 
        s = s.replaceFirst("6", "9");
        return Integer.parseInt(s);
    }
}
