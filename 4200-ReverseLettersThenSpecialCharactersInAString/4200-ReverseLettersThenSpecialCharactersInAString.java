// Last updated: 7/9/2026, 9:45:48 AM
class Solution {
    public String reverseByType(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)>='a'&& s.charAt(i)<='z'){ 
                a++;
            }
            else{
            b++;
            }
        }
        char c[]=new char[a];
        char sp[]=new char[b];
        int a1=0;
        int b1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                c[a1]=s.charAt(i);
                a1++;
            }
            else{
            sp[b1]=s.charAt(i);
            b1++;
            }
        }
        int al=c.length-1;
        int bl=sp.length-1;
        String res="";
       // System.out.print(bl);
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                res+=c[al--];
            }
            else
            res+=sp[bl--];
        }
        return res;
    }
}