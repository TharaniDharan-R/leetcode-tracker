// Last updated: 7/9/2026, 9:47:40 AM
class Solution {
    public String reversePrefix(String word, char ch) {
    //StringBuilder sb=new StringBuilder();
    String s="";
    int n=-1;
    for(int i=0;i<word.length();i++){
        if(word.charAt(i)==ch){
            n=i;
            break;
        }  
    }
    for(int i=n;i>=0;i--){
        s+=word.charAt(i);
    }
    for(int i=n+1;i<word.length();i++){
        s+=word.charAt(i);
    }
    
        return s;
        
        
    }
}