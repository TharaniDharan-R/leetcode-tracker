// Last updated: 7/9/2026, 9:48:02 AM
class Solution {
    public String mergeAlternately(String w1, String w2) {
        int r=0;
        int l=0;
        String s="";
        int len ;
        if(w1.length()>w2.length())
        len=w1.length();
        else
        len=w2.length();
        //System.out.print(len);
       while(len>0){
        if(r<w1.length())
            s+=w1.charAt(r++);
            if(l<w2.length())
            s+=w2.charAt(l++);
           len--;
            
        }
        return s;
    }
}