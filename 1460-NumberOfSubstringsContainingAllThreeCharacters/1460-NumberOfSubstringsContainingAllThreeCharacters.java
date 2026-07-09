// Last updated: 7/9/2026, 9:48:29 AM
class Solution {
    public int numberOfSubstrings(String s) {
        // String c1="a";
        // String c2="b";
        // String c3="c";

        // int c=0;
        
        // for(int i=0;i<s.length();i++){
        //     String s2="";
        //     for(int j=i;j<s.length();j++){
        //         s2+=s.charAt(j);
        //     System.out.println(s2);
        //     if(s2.contains(c1) && s2.contains(c2) && s2.contains(c3))
        //     c++;
        //     }
            
        // }
        // return c;
        int l=0;
        int ans=0;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')c1++;
            if(s.charAt(i)=='b')c2++;
            if(s.charAt(i)=='c')c3++;
            while(c1>0 && c2>0 && c3>0){
                ans+=s.length()-i;
                if(s.charAt(l)=='a')c1--;
            if(s.charAt(l)=='b')c2--;
            if(s.charAt(l)=='c')c3--;
            l++;    
            }
        }

    return ans;
    }
}