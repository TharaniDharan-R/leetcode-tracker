// Last updated: 7/9/2026, 9:48:48 AM
class Solution {
    public int bitwiseComplement(int n) {
        String b=Integer.toBinaryString(n);
        String c="";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='0')
            c+=1;
            else
            c+=0;
        }
        //System.out.print(c);
        int s=Integer.parseInt(c,2);
        return s;
    }
}