// Last updated: 7/9/2026, 9:47:21 AM
class Solution {
    public boolean digitCount(String num) {
       // int n=Integer.prseInt(num);
       //boolean b=true;
        for(int i=0;i<num.length();i++){
       int c=0;
            for(int j=0;j<num.length();j++){
                if(i==num.charAt(j)-'0')
                c++;
            }
            if(c!=num.charAt(i)-'0')
            return false;

        }
        return true;
    }
}