// Last updated: 7/9/2026, 9:45:47 AM
class Solution {
    public String trimTrailingVowels(String s) {
        int l=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                l--;
            }
            else
                break;
        }
        for(int i=0;i<l;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}