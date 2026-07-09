// Last updated: 7/9/2026, 9:50:21 AM
class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split(" +");
        String str="";
        for(int i=a.length-1;i>=0;i--){
            str+=a[i];
            if(i!=0)
            str+=" ";
            
        }
        System.out.println(str);
        return str;
    }
}