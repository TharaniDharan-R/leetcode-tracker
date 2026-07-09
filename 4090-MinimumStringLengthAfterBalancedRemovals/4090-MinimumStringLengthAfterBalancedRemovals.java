// Last updated: 7/9/2026, 9:45:56 AM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
            a++;
            if(s.charAt(i)=='b')
            b++;
        }
        return Math.abs(a-b);
    }
}