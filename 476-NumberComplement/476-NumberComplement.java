// Last updated: 7/9/2026, 9:49:22 AM
class Solution {
    public int findComplement(int num) {
        String b=Integer.toBinaryString(num);
        String c="";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='0')
            c+=1;
            else
            c+=0;
        }
        return Integer.parseInt(c,2);
    }
}