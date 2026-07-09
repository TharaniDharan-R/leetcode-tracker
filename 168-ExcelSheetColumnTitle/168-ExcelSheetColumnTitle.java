// Last updated: 7/9/2026, 9:50:12 AM
class Solution {
    public String convertToTitle(int c) {
        String a="";
        while(c>0){
            c--;
            char ch=(char)('A'+(c%26));
            a=ch+a;
            c=c/26;            
        }
        return String.valueOf(a);
    }
}