// Last updated: 7/9/2026, 9:50:29 AM
class Solution {
    public boolean isPalindrome(String s) {
       String a="";
       StringBuilder sb= new StringBuilder();
       s=s.toLowerCase();
       for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            a+=s.charAt(i);
            sb.append(s.charAt(i));
        }
       } 
       if(a.equals(sb.reverse().toString()))
       return true;
       return false;
    }
}