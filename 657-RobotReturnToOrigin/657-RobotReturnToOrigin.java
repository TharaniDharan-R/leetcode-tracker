// Last updated: 7/9/2026, 9:49:06 AM
class Solution {
    public boolean judgeCircle(String m) {
        int a=0;
        int b=0;
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='U')
            a++;
            if(m.charAt(i)=='D')
            a--;
            if(m.charAt(i)=='L')
            b++;
            if(m.charAt(i)=='R')
            b--;
        }
    return (a==0 && b==0);
        
    }
}