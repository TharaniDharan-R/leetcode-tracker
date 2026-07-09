// Last updated: 7/9/2026, 9:45:51 AM
class Solution {
    public String reversePrefix(String s, int k) {
       // k=k-1;
        //int n=k-1;
        StringBuilder s1=new StringBuilder();
       for(int i=k-1;i>=0;i--){
        s1.append(s.charAt(i));
       }
        for(int i=k;i<s.length();i++){
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}