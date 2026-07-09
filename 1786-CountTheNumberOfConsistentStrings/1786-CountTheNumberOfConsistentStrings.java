// Last updated: 7/9/2026, 9:48:10 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            Boolean b=true;
            for(int j=0;j<words[i].length();j++){
                char ch =words[i].charAt(j);
                if(!allowed.contains(String.valueOf(ch))){
                b=false;
                break;
            }
                // else
                // b=false;
            }
            if(b)
            c++;
        }
        return c;
    }
}