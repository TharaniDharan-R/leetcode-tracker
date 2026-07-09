// Last updated: 7/9/2026, 9:47:54 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        HashSet<Character>c= new HashSet<>();
       // String c[]=new String[26];
        for(int i=0;i<n;i++){
            if(sentence.charAt(i)>=97 && sentence.charAt(i)<=122 && n>=26){
            c.add(sentence.charAt(i));
        }    
        }
        if(c.size()==26)
        return true;
        else
       return false;     
    }
}