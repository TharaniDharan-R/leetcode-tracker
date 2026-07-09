// Last updated: 7/9/2026, 9:47:31 AM
class Solution {
    public String firstPalindrome(String[] words) {
       
       for(int i=0;i<words.length;i++){
        String s="";
        for(int j=0;j<words[i].length();j++){
            s+=words[i].charAt(words[i].length()-1-j);
        }
        if(s.equals(words[i]))
        return words[i];
       }
       return "";
        }
       
    }
