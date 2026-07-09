// Last updated: 7/9/2026, 9:49:15 AM
class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:a){
            StringBuilder reversedWord=new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
        
    }
}